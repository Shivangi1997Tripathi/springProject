package shivi.springDemo;

public class CricketCoach implements Coach{
	
	private FortuneService fortuneService;
	
	private String emailAddress;
	private String team;
		
	
    // setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket coach insde stter method - setFortuneService");
		this.fortuneService = fortuneService;
	}
	
	
	
	public void setEmailAddress(String emailAddress) {
		System.out.println("Cricket coach insde stter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}



	public void setTeam(String team) {
		System.out.println("Cricket coach insde stter method - setTeam");
		this.team = team;
	}

	


	public String getEmailAddress() {
		return emailAddress;
	}



	public String getTeam() {
		return team;
	}



	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Need to practice batting ";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	

}
