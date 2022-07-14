package anoundtech;

import java.io.File;

import java.util.Scanner;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class LoopDemo {
	  static Logger logger =Logger.getLogger(LoopDemo.class);
	
	public static void main(String[] args) {
		String log4jConfigFile = System.getProperty("user.dir") + File.separator + "log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		int number, sum = 0
				; 
		 Scanner sc = new Scanner(System.in); 
		 
		 logger.info("n Please Enter any integer Value below 10: "); 
		 number = sc.nextInt(); 
		 
		 while (number <= 10) { 
		 sum = sum + number; 
		 number++; 
		 } 
		 logger.info(" Sum of the Numbers From the While Loop is:"+sum); 
	}

}
