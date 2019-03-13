package sogeti.spring.practica1;

public class Developer implements Employee {
	
	private String teamName;
	private String emailAddress;
	
	private HobbyService hobbyService;
	
	public Developer() {
		System.out.println("Inside Developer default constructor!");
	}
	
	public Developer(HobbyService hobbyService) {
		this.hobbyService = hobbyService;
	}

	public String getDailyTasks() {
		return "Implement methods for BD connectivity";
	}

	public String getHobby() {
		return hobbyService.getHobby();
	}

	public void setHobbyService(HobbyService hobbyService) {
		this.hobbyService = hobbyService;
	}
	
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeamName() {
		return teamName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}
	
	// add an init method
	public void customStartup() {
		System.out.println("Developmemnt: inside method customStartup");
	}
	
	// add a destroy method
	public void customDestroy() {
		System.out.println("Developmemnt: inside method customDestroy");
	}
}
