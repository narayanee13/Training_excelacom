package com.exception;

public class Main {

	public static void main(String[] args) {
    EmployeeService es = new EmployeeService();
    
    Employee ram = new Employee();
	ram.setEmployeeId(101);
	ram.setDesignation("developer");
	ram.setEmployeeName("ramesh");
	ram.setSalary(20000);
   
	Employee shyam=null;
	try {
		shyam = new Employee(102,"dev", "shyam", 3000);
	}
	catch(RangeCheckException e) {
		e.printStackTrace();
	}
	Employee[] empList = {ram,shyam};
	System.out.println(es.calculateTotalSalary(empList));
	}

}
