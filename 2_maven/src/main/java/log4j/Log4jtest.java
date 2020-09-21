package log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger log= LogManager.getLogger(Log4jtest.class);
		//PropertyConfigurator.configure("log4j2.properties");
		
		
		log.info("This is info message");
		log.error("This is Error !!!");
		log.warn("This is warn !!!");	
		log.fatal("This is fatal !!!");

	}

}
