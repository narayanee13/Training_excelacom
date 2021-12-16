package com.employee.exceptionHandling;

public class Employee {

private int employeeId;
private String employeeName;
private String designation;
private double salary;

public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	if(salary<=0) {
		
	 try {
		throw new RangeCheckException("Salary should be a positive double value");
	} catch (RangeCheckException e) {
		e.printStackTrace();
	}
	}
	else {
	this.salary = salary;
}
}
public Employee(int employeeId, String employeeName, String designation, 
		double salary) throws RangeCheckException{
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.designation = designation;
	this.salary = salary;
	
	if(this.salary<0) {
		throw new RangeCheckException("Salary should be a positive double value");
	}else {
		this.salary=salary;	
}
}
public Employee() {
	super();
}
@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", designation=" + designation
			+ ", salary=" + salary + "]";
}

}

