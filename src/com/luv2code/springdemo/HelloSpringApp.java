package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
	public static void main(String[] args) {
		// load spring configuration file 
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve bean from spring container
		Coach theCoach= context.getBean("myCoach", Coach.class);
		//call method on the bean 
		System.out.println(theCoach.getDailyWorkout());
		
		//let call our new method for fortune
		System.out.println(theCoach.getDailyFortune());
		
		Coach myCoach1= context.getBean("myCoach1",Coach.class);
		System.out.println(myCoach1.getDailyFortune());
		// close the context
		context.close();
	}
}
