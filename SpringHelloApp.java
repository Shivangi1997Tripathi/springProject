package shivi.springDemo;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class SpringHelloApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    //Load spring configuration file 
		ClassPathXmlApplicationContext context =
    		new ClassPathXmlApplicationContext("applicationContext.xml");
   
		//retrieve bean from spring container  
    Coach theCoach = context.getBean("myCoach",Coach.class);
    
    //call method on the bean
    System.out.println(theCoach.getDailyWorkout());
    
    //call new method for fortune
    System.out.println(theCoach.getDailyFortune());
    
    //close the context
    context.close();
	}

}
