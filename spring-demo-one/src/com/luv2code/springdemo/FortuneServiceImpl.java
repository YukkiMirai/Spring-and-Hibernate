package com.luv2code.springdemo;

import java.util.Random;

public class FortuneServiceImpl implements FortuneService {
	private String[] fortune= {"Love you","Luck for you","Sticky for my love"};
	
	Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(fortune.length);
		return fortune[index];
	}

}
