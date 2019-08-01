package com.specialys.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayApplication {

	@Bean
	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}
}