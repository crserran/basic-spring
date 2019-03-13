package sogeti.spring.practica1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	 public static void main( String[] args ) {
		 
		 // load the spring configuration file
		 ClassPathXmlApplicationContext context = 
				 new ClassPathXmlApplicationContext("applicationContext.xml");
		 
		 // retrieve bean from spring container
		 Employee theEmployee = context.getBean("myEmployee", Employee.class);
		 
		 // call methods on the bean
		 System.out.println(theEmployee.getDailyTasks());
		 
		 // let's call the new method of employee
		 System.out.println(theEmployee.getHobby());
		 
		 // Call our new methods to get the literal values
		 System.out.println(((Developer) theEmployee).getTeamName() + " - " + ((Developer) theEmployee).getEmailAddress());
		 
		 // close the context
		 context.close();
	 }
}
