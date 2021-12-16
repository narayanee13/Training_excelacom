package com.inheritance;

public class Application {

	public static void main(String[] args) {
		Employee ram = new Employee(101, "ramesh", "developer", 50000);
		
		String[] skills = {"java", "dotNet", "testing", "mainframe"};
		Manager mgr = new Manager(102, "suresh", "manager", 75000, skills);
		System.out.println(ram);
		
		System.out.println(mgr.getEmployeeId()+" " +mgr.getEmployeeName()+ " " +mgr.getDesignation()+" "+mgr.getSalary());
		for(String eachSkill:mgr.getSkillset()) {
		System.out.println(eachSkill);
	}
    Employee[] e = new Employee[2];
    e[0]= ram;
    e[1]= mgr;
    // Employee[] emplist={ram,mgr};
    EmployeeService emp = new EmployeeService();
     emp.printEmployees(e);
   }
}
