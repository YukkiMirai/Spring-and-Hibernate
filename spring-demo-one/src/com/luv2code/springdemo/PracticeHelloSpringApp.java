package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeHelloSpringApp {
	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach sexCoach = context.getBean("mySexCoach", Coach.class);
		System.out.println("sexCoach impl Coach: "+ sexCoach.getDailyFortune());
		Coach sexCoach2 = context.getBean("mySexCoach", Coach.class);
		System.out.println("sexCoach impl Coach2: "+ sexCoach2.getDailyFortune());
		System.out.println(sexCoach == sexCoach2);
		
		context.close();
	}

}
