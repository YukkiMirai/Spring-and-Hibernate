package com.luv2code.springdemo;

public class SexCoach implements Coach {
	private FortuneService fortuneService;

	public SexCoach() {
		System.out.println("SexCoach: Constructor no arg");

	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
