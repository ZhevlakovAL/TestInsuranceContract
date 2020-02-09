package virtu.systems.demo.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.core.io.support.PropertySourceFactory;
import org.springframework.data.util.Pair;
import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@PropertySource(value = "classpath:config.json", factory=JsonProperties.JsonLoader.class )
@Controller
@EnableAutoConfiguration
public class JsonProperties {
    @Autowired
    private Environment env;

    private List<String> types;

    private Map<String, Double> typesRate;

    private List<Pair<String, Double>> yearsRate;

    private List<Pair<String, Double>> squaresRate;

    public List<String> getTypes() {
        if(types == null) {
            synchronized (JsonProperties.class) {
                if(types == null) {
                    List<LinkedHashMap<String, String>> typesFromEnv = env.getProperty("type", ArrayList.class);
                    types = typesFromEnv.stream()
                            .map(map -> new ArrayList<>(map.keySet()))
                            .flatMap(Collection::stream)
                            .collect(Collectors.toList());
                }
            }
        }
        return types;
    }

    public double getTypeRate(String type) {
        if(typesRate == null) {
            synchronized (JsonProperties.class) {
                if(typesRate == null) {
                    List<LinkedHashMap<String, String>> types = env.getProperty("type", ArrayList.class);
                    typesRate = types.stream()
                            .map(LinkedHashMap::entrySet)
                            .flatMap(Collection::stream)
                            .collect(Collectors.toMap(Map.Entry::getKey, v -> Double.parseDouble(v.getValue())));
                }
            }
        }
        return typesRate.get(type);
    }

    public double getYearRate(Integer year) {
        if(yearsRate == null) {
            synchronized (JsonProperties.class) {
                if(yearsRate == null) {
                    List<LinkedHashMap<String, String>> years = env.getProperty("year", ArrayList.class);
                    yearsRate = years.stream()
                            .map(LinkedHashMap::entrySet)
                            .flatMap(Collection::stream)
                            .map(entry -> Pair.of(entry.getKey(), Double.parseDouble(entry.getValue())))
                            .collect(Collectors.toList());
                }
            }
        }
        val value = yearsRate.stream()
                .filter(v -> match(v.getFirst(), year)).findFirst()
                .orElseThrow(() -> new RuntimeException("wrong config"));
        return value.getSecond();
    }

    private boolean match(String pattern, Integer value) {
        if(pattern.startsWith("<")) {
            int number = Integer.parseInt(pattern.replaceAll("<", "").trim());
            return value < number;
        }
        if(pattern.startsWith(">")) {
            int number = Integer.parseInt(pattern.replaceAll(">", "").trim());
            return value > number;
        }
        if(pattern.contains("-")) {
            int from = Integer.parseInt(pattern.substring(0, pattern.indexOf("-")).trim());
            int to = Integer.parseInt(pattern.substring(pattern.indexOf("-")+1).trim());
            return value >= from && value <= to;
        }
        throw new RuntimeException("wrong config");
    }

    public double getSquareRate(Double square) {
        if(squaresRate == null) {
            synchronized (JsonProperties.class) {
                if(squaresRate == null) {
                    List<LinkedHashMap<String, String>> years = env.getProperty("square", ArrayList.class);
                    squaresRate = years.stream()
                            .map(LinkedHashMap::entrySet)
                            .flatMap(Collection::stream)
                            .map(entry -> Pair.of(entry.getKey(), Double.parseDouble(entry.getValue())))
                            .collect(Collectors.toList());
                }
            }
        }
        val value = squaresRate.stream()
                .filter(v -> match(v.getFirst(), square)).findFirst()
                .orElseThrow(() -> new RuntimeException("wrong config"));
        return value.getSecond();
    }

    private boolean match(String pattern, Double value) {
        if(pattern.startsWith("<")) {
            double number = Double.parseDouble(pattern.replaceAll("<", "").trim());
            return value < number;
        }
        if(pattern.startsWith(">")) {
            double number = Double.parseDouble(pattern.replaceAll(">", "").trim());
            return value > number;
        }
        if(pattern.contains("-")) {
            double from = Double.parseDouble(pattern.substring(0, pattern.indexOf("-")).trim());
            double to = Double.parseDouble(pattern.substring(pattern.indexOf("-")+1).trim());
            return value >= from && value <= to;
        }
        throw new RuntimeException("wrong config");
    }

    public static class JsonLoader implements PropertySourceFactory {

        @Override
        public org.springframework.core.env.PropertySource<?> createPropertySource(String name,
                                                                                   EncodedResource resource) throws IOException {
            Map readValue = new ObjectMapper().readValue(resource.getInputStream(), Map.class);




            return new MapPropertySource("json-source", readValue);
        }

    }

}
/*
  "type" : [
          {"Квартира" : "1,7"},
          {"Дом" : "1,5"},
          {"Комната" : "1,3"}
          ],
          "year" : [
          {"<2000" :  "1,3"},
          {"2000-2014" :  "1,6"},
          {">2014" :  "2"}
          ],
          "square" : [
          {"<50" :  "1,2"},
          {"50-100" :  "1,5"},
          {">100" :  "2"}
          ]*/


