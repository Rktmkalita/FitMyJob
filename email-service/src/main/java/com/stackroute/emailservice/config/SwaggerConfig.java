package com.stackroute.emailservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.stackroute.emailservice.controller"))
                .paths(regex("/email/.*"))
                .build()
                .apiInfo(metaData());
    }

     ApiInfo metaData() {
         return new ApiInfo("Email API","Send email api","1.0","http://localhost:8070/email"
                 ,new Contact("Raktim","url","raktim.kalita@globallogic.com"),"opensource","", Collections.emptyList());
    }
}
