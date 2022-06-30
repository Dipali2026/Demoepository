package Log4jfile;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Log4jDemo 
{


	public static Logger log = LogManager.getLogger( Log4jDemo.class );
	
	

	public static void main(String[] args) 
	{
		
		
		
		log.debug("Setting chrome driver property");
		
		log.info("window maximized");
		
		log.debug("Hitting url");
		
		log.error("page not found");
		
		
	}

}
