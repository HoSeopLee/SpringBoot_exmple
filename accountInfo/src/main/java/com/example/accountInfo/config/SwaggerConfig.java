package com.example.accountInfo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;
import java.util.Set;

public class SwaggerConfig {
    @Value("${swagger.host}")
    String host;

    @Value("${swagger.protocol}")
    String protocol;

    String profile = System.getProperty("spring.profiles.active");

    @Bean
    public Docket apiDocket() {
        return new Docket(DocumentationType.SWAGGER_2).host(host).protocols(getProtocols()).select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.ant("/**"))
                .build();
    }

    public Set<String> getProtocols() {
        return Collections.singleton("http");
    }
}
