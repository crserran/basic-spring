package sogeti.spring.practica1;

public class Manager implements Employee {

	// define private field for the dependency
	private HobbyService hobbyService;
	
	public Manager() {
		System.out.println("Inside Manager default constructor!");
	}
	
	// define a constructor for dependency injection
	public Manager(HobbyService hobbyService) {
		this.hobbyService = hobbyService;
	}
	
	public String getDailyTasks() {
		return "Plan the next sprint";
	}

	public String getHobby() {
		return hobbyService.getHobby();
	}

	public void setHobbyService(HobbyService hobbyService) {
		this.hobbyService = hobbyService;
	}
	
}
