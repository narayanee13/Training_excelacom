package com.inheritance;

public class EmployeeService {
	public void printEmployees(Employee[] emplist) {
//		for(int i=0; i<emplist.length;i++) {
//			System.out.println(emplist [i]);
//		}
		for (Employee eachSkill:emplist) {
			System.out.println(eachSkill);

		}
	}

}
