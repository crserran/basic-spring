package sogeti.spring.practica1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApp {

	 public static void main( String[] args ) {
		 
		 // load the spring configuration file
		 ClassPathXmlApplicationContext context = 
				 new ClassPathXmlApplicationContext("beanLifeCycle_applicationContext.xml");
		 
		 // retrieve bean from spring container
		 Employee theEmployee = context.getBean("myEmployee", Employee.class);
		 
		 // close the context
		 context.close();
	 }
}
