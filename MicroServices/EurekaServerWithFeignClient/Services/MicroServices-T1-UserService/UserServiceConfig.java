package com.boot.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class UserServiceConfig 
{
	@Bean
	@LoadBalanced
	public RestTemplate rest()
	{
		return new RestTemplate();
	}
}
