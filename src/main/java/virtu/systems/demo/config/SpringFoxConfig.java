package virtu.systems.demo.config;

import com.google.common.base.Predicate;
import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Optional;

@Configuration
@EnableSwagger2
public class SpringFoxConfig {

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Demo")
                .description("insurance contract")
                .termsOfServiceUrl("")
                .version("0.1.0")
                .contact(new Contact("", "", "ZhevlakovAL@gmail.com"))
                .build();
    }

    @Bean
    public Docket demo() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("Demo")
                .select()
                .apis(getSelector())
                .build()
                .genericModelSubstitutes(Optional.class)
                .apiInfo(apiInfo());
    }

    private static Predicate<RequestHandler> getSelector() {
        return input -> input.findAnnotation(ApiOperation.class).isPresent();
    }
}

