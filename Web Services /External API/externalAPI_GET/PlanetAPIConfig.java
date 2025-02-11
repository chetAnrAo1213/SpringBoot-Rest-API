package com.boot.externalAPI_GET;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class PlanetAPIConfig {

    @Bean(name="restTemplatePlanet")
    
    public RestTemplate restTemplatePlanet() {
        return new RestTemplate();
    }
}
