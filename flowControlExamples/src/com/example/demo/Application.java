package com.example.demo;

import com.flowControlExamples.*;
public class Application {

	public static void main(String[] args) {

		Employee ram = new Employee(101, "ramesh", "manager", 60000);
		Employee shyam = new Employee(101, "ramesh", "manager", 60000);
		
		boolean isEqual = ram.equals(shyam);
		System.out.println("expected: true => Actual:="+ isEqual);
        
		Employee oneMoreRam = ram;
		
		boolean isSame = ram.equals(oneMoreRam);
		System.out.println("expected: true => Actual:="+ isSame);
	}

}
