package utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Log {
	
	
	
	private static Logger Log;
	
	public Log() {
	
	
		    Log = Logger.getLogger(Log.class.getName());
			DOMConfigurator.configure("C:\\Users\\Arun Ragavan\\eclipse-workspace\\Selenium_Training\\Log4j_Sample.xml");
	}	

		


		public static void startTestCase(String sTestCaseName){
		 
		 Log.info("****************************************************************************************");
		 
		 Log.info("****************************************************************************************");
		 
		 Log.info("$$$$$$$$$$$$$$$$$$$$$                 "+sTestCaseName+ "       $$$$$$$$$$$$$$$$$$$$$$$$$");
		 
		 Log.info("****************************************************************************************");
		 
		 Log.info("****************************************************************************************");
		 
		 }
		 
		 //This is to print log for the ending of the test case
		 
		 public static void endTestCase(String sTestCaseName){
		 
		 Log.info("XXXXXXXXXXXXXXXXXXXXXXX             "+"-E---N---D-"+"             XXXXXXXXXXXXXXXXXXXXXX");
		 
		 Log.info("X");
		 
		 Log.info("X");
		 
		 Log.info("X");
		 
		 Log.info("X");
		 
		 }
		 
		 // Need to create these methods, so that they can be called  
		 
		 public  void info(String message) {
		 
		 Log.info(message);
		 
		 }
		 
		 public  void warn(String message) {
		 
		    Log.warn(message);
		 
		 }
		 
		 public  void error(String message) {
		 
		    Log.error(message);
		 
		 }
		 
		 public  void fatal(String message) {
		 
		    Log.fatal(message);
		 
		 }
		 
		 public  void debug(String message) {
		 
		    Log.debug(message);
		 
		 }
		 
}	
