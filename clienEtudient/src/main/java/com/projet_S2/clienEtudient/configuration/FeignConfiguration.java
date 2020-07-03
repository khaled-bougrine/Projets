package com.projet_S2.clienEtudient.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.auth.BasicAuthRequestInterceptor;

@Configuration
public class FeignConfiguration {
	@Bean
	public BasicAuthRequestInterceptor rasicAuthRequestInterceptor() {
		return new BasicAuthRequestInterceptor("microservice-apigatway", "0000");
	}

}
