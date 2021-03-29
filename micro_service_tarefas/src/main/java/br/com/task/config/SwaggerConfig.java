package br.com.task.config;

import java.util.ArrayList;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).ignoredParameterTypes(Pageable.class).select()
                .apis(RequestHandlerSelectors.basePackage("com.controller")).paths(PathSelectors.any()).build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo("Api Tarefas", "Api de cadastro de tarefas", "1.0", "Terms of Service",
                new Contact("Samuel Marques Costa", "https://www.linkedin.com/in/samuelmarques231198/",
                        "samuelmarques231198@gmail.com"),
                "Apache License Version 2.0", "https://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList<VendorExtension>());

        return apiInfo;
    }
}
