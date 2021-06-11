package com.appsdeveloperblog.app.ws;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {

    @Bean
    public Docket userAPI() {
        return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors
                //include the Controllers package which requires SWAGGER
                .basePackage("com.appsdeveloperblog.app.ws.ui.controller"))
                //include the URIs which requires SWAGGER
                .paths(PathSelectors.regex("/users.*")).build();
    }
}
