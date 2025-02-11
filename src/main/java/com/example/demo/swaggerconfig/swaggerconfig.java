package com.example.demo.swaggerconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;


@Configuration
public class swaggerconfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Person Registration API")
                        .description("API documentation for the Student Registration application")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("Prathamesh")
                                .email("prathameshbakale7555@gmail.com")
                                .url("https://google.com")
                        )
                );
    }
}
