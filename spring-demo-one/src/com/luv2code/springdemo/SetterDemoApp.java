package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrive bean from spring container
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		// call methods on the bean
		// ... let's come back to this ...		
		System.out.println(theCoach.getDailyFortune());
		System.out.println("team: "+theCoach.getTeam());
		System.out.println("email: "+theCoach.getEmailAddress());
		//het roi nhe
		System.out.println("\nCode cua Yukki");
		HappyFortuneService hP = new HappyFortuneService();
		System.out.println("day la happy forturn service: "+ hP.getFortune());
		FortuneService fS = new HappyFortuneService(); //trong Applicationcontext
		System.out.println(fS.getFortune());
		CricketCoach test = new CricketCoach(); // 
		test.setFortuneService(fS); //trong Applicationcontext
		System.out.println(test.getDailyFortune());
		
		Coach theCoach2 = context.getBean("myCricketCoach", CricketCoach.class);
		System.out.println("so 2: "+theCoach2.getDailyFortune());
		// close the context
		context.close();

	}

}
