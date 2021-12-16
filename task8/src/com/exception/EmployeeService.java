package com.exception;

public class EmployeeService {
 public double calculateTotalSalary(Employee[] empList) {
	 double total =0;
     if(empList.length<2 || empList.length>5) {
    	 try {
    		 throw new RangeCheckException("Length should be 2 to 5");
    	 }
    	 catch(RangeCheckException e) {
    		 e.printStackTrace();
    	 }
     }else {
    	 for(Employee emp:empList) {
    		 total = total+emp.getSalary();
    	 }
     }
     return total;
 }
}

