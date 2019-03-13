package sogeti.spring.practica1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        Employee employee = new Manager();
        
//        System.out.println(employee.getDailyTasks());
        
        HobbyService hobbyService = new MusicHobbyService();
        
        Developer employee = new Developer();
        
        employee.setHobbyService(hobbyService);
        
    }
}
