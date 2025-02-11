package com.boot.JsonJayway;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class JayWayAPIConfig {

    @Bean(name="restTemplateJayWay")
    public RestTemplate restTemplateCensor() {
        return new RestTemplate();
    }
}
