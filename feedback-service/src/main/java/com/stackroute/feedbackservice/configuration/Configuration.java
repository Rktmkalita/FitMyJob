package com.stackroute.feedbackservice.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.mapping.event.ValidatingMongoEventListener;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import javax.validation.Validator;
import java.util.Collections;

@org.springframework.context.annotation.Configuration
public class Configuration {
    @Bean
    public ValidatingMongoEventListener validatingMongoEventListener(Validator validator){
        return new ValidatingMongoEventListener(validator);
    }
    @Bean
    public Docket swaggerConfig(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .apiInfo(new ApiInfo("Feedback API","Feedback Service api description","1.0",""
                        ,new Contact("Niladree","url","niladree.banerjee@globallogic.com"),"opensource","", Collections.emptyList()));
    }

  

}
