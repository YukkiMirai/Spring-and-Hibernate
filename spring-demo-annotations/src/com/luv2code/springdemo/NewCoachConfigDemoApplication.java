package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class NewCoachConfigDemoApplication {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(NewConfig.class);
		Coach theCoach = context.getBean("newCoach", Coach.class);
		System.out.println(theCoach.getDailyFortune());
		context.close();
		
	}
	
}
