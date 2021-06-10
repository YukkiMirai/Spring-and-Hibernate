package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NewConfig {
	
	@Bean
	public FortuneService newFortuneService() {
		return new NewFortuneService();
	}
	
	@Bean
	public NewCoach newCoach() {
		return new NewCoach(newFortuneService());
	}
	
}
