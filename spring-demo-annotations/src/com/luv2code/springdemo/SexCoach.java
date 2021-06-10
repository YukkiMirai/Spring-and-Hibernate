package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SexCoach implements Coach {
	private FortuneService fortuneService;
	
	
	
	public FortuneService getFortuneService() {
		return fortuneService;
	}
	
	@Autowired
	@Qualifier("solution5")
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "xxx xxx xxx 18+";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
}
