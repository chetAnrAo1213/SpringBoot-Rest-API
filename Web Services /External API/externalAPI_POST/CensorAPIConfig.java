package com.boot.externalAPI_POST;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class CensorAPIConfig {

    @Bean(name="restTemplateCensor")
    public RestTemplate restTemplateCensor() {
        return new RestTemplate();
    }
}
