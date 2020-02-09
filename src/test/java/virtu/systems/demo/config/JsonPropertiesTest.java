package virtu.systems.demo.config;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import virtu.systems.demo.DemoApplication;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class JsonPropertiesTest {

    @Autowired
    private JsonProperties properties;

    @Test
    public void getTypes() {
        List<String> list = new ArrayList<>();
        list.add("Квартира");
        list.add("Дом");
        list.add("Комната");
        assertEquals(list, properties.getTypes());
    }

    @Test
    public void getTypeRate() {
        assertEquals(1.7, properties.getTypeRate("Квартира"));
    }

    @Test
    public void getYearRate() {
        assertEquals(1.3, properties.getYearRate(1910));
        assertEquals(1.6, properties.getYearRate(2010));
        assertEquals(2, properties.getYearRate(2020));
    }

    @Test
    public void getSquareRate() {
        assertEquals(1.2, properties.getSquareRate(40.));
        assertEquals(1.5, properties.getSquareRate(70.));
        assertEquals(2, properties.getSquareRate(250.));
    }
}