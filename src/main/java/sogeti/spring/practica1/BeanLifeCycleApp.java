package sogeti.spring.practica1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleApp {

	 public static void main( String[] args ) {
		 
		 // load the spring configuration file
		 ClassPathXmlApplicationContext context = 
				 new ClassPathXmlApplicationContext("beanScope_applicationContext.xml");
		 
		 // retrieve bean from spring container
		 Employee theEmployee = context.getBean("myEmployee", Employee.class);
		 
		 Employee otherEmployee = context.getBean("myEmployee", Employee.class);
		 
		 // check if they are the same
		 boolean result = (theEmployee == otherEmployee);
		 
		 // print the results
		 System.out.println("Pointing to the same object: " + result);
		 
		 System.out.println("Memory location for theEmployee" + theEmployee);
		 System.out.println("Memory location for otherEmployee" + otherEmployee);
		 
		 // close the context
		 context.close();
	 }
}
