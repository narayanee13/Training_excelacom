package com.example.demo;

import com.example.model.*;
import com.example.services.EmployeeService;
import java.util.Scanner;
public class Application {

	public static void main(String[] args) {
    
//	using wrapper class, parsing the string representation to respective types
		
    int employeeId = Integer.parseInt(args[0]);
    String employeeName = args[1];
    String designation = args[2];
    double salary = Double.parseDouble(args[3]);
    
	Employee ram = new Employee(101, "ramesh", "developer", 50000);
	
	Scanner sc = new Scanner(System.in); 
	System.out.println("enter the employee id");
	  int empId = sc.nextInt();
	System.out.println("enter the employee name");
	  String empName = sc.next();
	System.out.println("enter the employee designation");
	  String desig = sc.next();
	System.out.println("enter the employee salary");
	  double empsal = sc.nextDouble();
	Employee shyam = new Employee(empId, empName, desig, empsal);
	
	sc.close();
	
//	calling the overloaded methods
	EmployeeService service = new EmployeeService();
	System.out.println("Expected: 18000 =>Actual:="+service.calculateBonus(shyam.getSalary()));
	System.out.println("Expected: 15000 =>Actual:="+service.calculateBonus(ram.getSalary()));

	Double salary2 = Double.valueOf(50000);
	int intSalary2 = (int)(salary2.doubleValue());
	System.out.println("Expected: 16000 =>Actual:="+service.calculateBonus(salary2));

	Employee rakesh = new Employee(101, "rakesh", "manager", 70000);
	
	System.out.println("Before :="+ rakesh.getSalary());
	service.updateSalary(rakesh);
	System.out.println("after :="+ rakesh.getSalary());
	
	System.out.println("Expected: 90000 =>Actual:="+rakesh.getSalary());

    Invoice.showAll();
	}

}
