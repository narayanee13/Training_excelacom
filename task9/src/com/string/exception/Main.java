package com.string.exception;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import com.logging.LoggingUtility;

public class Main {

	public static void main(String[] args) {
		
		Logger logger= LoggingUtility.getLogger(Main.class);
		  //logger.setLevel(Level.INFO );
		  
			FileHandler handler;
			Customer ram = new Customer();
			ram.setCustomerId(208);
			ram.setCustomerName("keerthana");
			ram.setEmail("keerthana23ss@gmail.com");
			ram.setPhoneNumber(675415524);
			logger.info(ram.toString());
			try {
				handler = new FileHandler("mylogs.log", true);
				logger.addHandler(handler);
				Customer c = new Customer(100,"narayanee","narayanee13@gmail.com",814636533);
			} catch (SecurityException | IOException | InvalidEmailException e) {
				e.printStackTrace();
			}
		}
		
	}


