package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroServicesT1HotelServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicesT1HotelServiceApplication.class, args);
	}

}
