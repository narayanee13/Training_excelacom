package com.example.streams;

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
	this.salary = salary;
}
public Employee(int employeeId, String employeeName, String designation, double salary) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.designation = designation;
	this.salary = salary;
}
@Override
public String toString() {
	return this.employeeId+","+ this.employeeName+","+this.designation+","+this.salary;
}

//public String twoString() {
//return this.employeeId+","+ this.employeeName+","+this.designation;
//}

public Employee() {
	super();
}

}
