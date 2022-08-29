package shivi.springDemo;

public class TrackCoach implements Coach {
	
	// define private field for dependency
		private FortuneService fortuneServices ;
		
		//define a constructor for dependency injection 
		public TrackCoach (FortuneService thefortune) {
			fortuneServices = thefortune;
		}


	public TrackCoach() {
			// TODO Auto-generated constructor stub
		}


	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run for 30mints daily";
	}

	@Override
	public String getDailyFortune() {
			return fortuneServices.getFortune();
	}

}
