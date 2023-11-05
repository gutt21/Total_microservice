package com.example.User.service.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class myconfig {

	@Bean
	@LoadBalanced   // it is marker interfacce
	public RestTemplate resttemplet() {
		
		return new RestTemplate();
	}
	
	
}
