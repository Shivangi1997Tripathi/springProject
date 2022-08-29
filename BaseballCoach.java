package shivi.springDemo;

public class BaseballCoach implements Coach {
	
	// define private field for dependency
	private FortuneService fortuneServices ;
	
	//define a constructor for dependency injection 
	public BaseballCoach (FortuneService thefortune) {
		fortuneServices = thefortune;
	}

	public String getDailyWorkout() {
		return "Spend 30mints on batting practice";
	}

	@Override
	public String getDailyFortune() {		
		return fortuneServices.getFortune();
	}
}
