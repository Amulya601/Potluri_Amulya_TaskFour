package com.epam.loggingdemo;


import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{	  
        private static final Logger LOGGER =LogManager.getLogger(App.class);
    	public static void main(String[] args) 
    	 {
    	    double amount, roi, years, si,ci;
    	    Scanner s=new Scanner (System. in);
    	    LOGGER.info("Enter Amount:");
    	    amount=s.nextDouble();
    	    LOGGER.info("Enter the No.of years:");
    	    years=s.nextDouble();
    	    LOGGER.info("Enter the Rate of  interest");
    	    roi=s.nextDouble();
    	    si=(amount * years * roi)/100;
    	    ci=amount * Math.pow(1.0+roi/100.0,years) - amount;
    	    LOGGER.info("Simple Interest="+si);
    	    LOGGER.info("Compound Interest="+ci);
    	   }
}
