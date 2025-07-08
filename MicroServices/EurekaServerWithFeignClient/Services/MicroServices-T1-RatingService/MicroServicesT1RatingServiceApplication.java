package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroServicesT1RatingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicesT1RatingServiceApplication.class, args);
	}

}
