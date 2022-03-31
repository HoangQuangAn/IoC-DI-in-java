package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// load the Spring configuration file 
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve from bean container 
		CricketCoach myCoach= context.getBean("myCricketCoach",CricketCoach.class);
		//call method on the bean 
		System.out.println(myCoach.getDailyFortune());
		//call our new method to get the literal value 
		System.out.println(myCoach.getEmailAddress());
		System.out.println(myCoach.getTeam());
		//Close the context
		context.close();
	}

}
