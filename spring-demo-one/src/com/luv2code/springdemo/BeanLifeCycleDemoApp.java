package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		// load the Spring conf
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		// retrive bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach theAlphaCoach = context.getBean("myCoach", Coach.class);
		//check if they are same
		boolean result = (theAlphaCoach==theCoach);
		System.out.println(theCoach.getDailyFortune());

		//close bean
		context.close();
	}

}
