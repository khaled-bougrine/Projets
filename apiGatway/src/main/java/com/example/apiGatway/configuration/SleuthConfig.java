package com.example.apiGatway.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import brave.sampler.Sampler;

@Configuration
public class SleuthConfig {
	@Bean
	public Sampler sleuthsampler() {
		return Sampler.ALWAYS_SAMPLE;
	}
}