package com.luv2code.springdemo;

public class BaseballCoach  implements Coach {
	private FortuneService fortuneService;
	
	//define a contructor for dendecy injection
	public BaseballCoach(FortuneService thefortuneService) {
		this.fortuneService=thefortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practices";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
}
