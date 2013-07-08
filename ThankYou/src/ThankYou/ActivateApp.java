package ThankYou;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ActivateApp {

	public static void main( String[] args )
    {
    	ApplicationContext context = 
             new ClassPathXmlApplicationContext("ThankYou.xml");
 
    	Mail mm = (Mail) context.getBean("Mail");
        mm.sendMail("staholdingsltd@gmail.com",
    		   "aabejide@vas-consulting.com",
    		   "Thank you", 
    		   "Good day \n\n Thank you for giving me an opportunity to bring some positive contributions into the Vas Team \n  Bosun  ");
 
    }
}
