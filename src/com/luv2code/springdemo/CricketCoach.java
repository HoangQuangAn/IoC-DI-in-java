package com.luv2code.springdemo;

public class CricketCoach implements Coach{
	private FortuneService fortuneService;
	public CricketCoach() {
		
	}
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		System.out.println("Cai nay cua An lam!");
		return fortuneService.getFortune() ;
	}

}
