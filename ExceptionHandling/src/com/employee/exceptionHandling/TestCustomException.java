package com.employee.exceptionHandling;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

import logging.example.LoggingUtility;

public class TestCustomException {

	public static void main(String[] args) {
    
    Logger logger = LoggingUtility.getLogger(TestCustomException.class);
    FileHandler handler;
	try {
		handler = new FileHandler("mylogs.log", true);
		logger.addHandler(handler);
	} catch (SecurityException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	Employee ram = new Employee();
	ram.setEmployeeId(101);
	ram.setDesignation("developer");
	ram.setEmployeeName("ramesh");
	ram.setSalary(20000);
	logger.info(ram.toString());
	
	try {
		Employee shyam = new Employee(101, "shyam", "developer", 50000);
		System.out.println(shyam);
		logger.info(shyam.toString());
	} catch (RangeCheckException e) {
		logger.warning(e.getMessage());
		//e.printStackTrace();
	}
	//System.out.println(ram);
  }
}
