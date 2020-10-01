package Demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.properties.*;
import org.apache.logging.log4j.message.LoggerNameAwareMessage;
public class Log4j {
	private static Logger logger =LogManager.getLogger(Log4j.class);
	public static void main(String[] args) {
	
		
	System.out.println("hello world");
	
	logger.trace("trace message");
	logger.info("This is information message");
	logger.error("This is error message");
	logger.warn("This is warn message");
	logger.fatal("This is fatal message");
	System.out.println("completed");

	}}