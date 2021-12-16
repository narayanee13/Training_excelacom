package com.employee;

public class Employee {
 private String employeeName;
 private double salary;
 private int empId;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(String employeeName, double salary, int empId) {
	super();
	this.employeeName = employeeName;
	this.salary = salary;
	this.empId = empId;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
}
