package com.example.services;

import com.example.model.*;

public class EmployeeService {
//	DRY Principle followed
    public double calculateBonus(Employee employee) {
    	return calculateBonus(employee.getSalary());
    }
//    overloaded method
    
    public double calculateBonus(double salary) {
    	return salary * .30;
    }
//    overloaded method with autoboxing
    public double calculateBonus(Double salary) {
    	return (salary * 0.30) + 1000;
    }
    
    public Employee updateSalary(Employee employee) {
    	double updatedSalary = employee.getSalary()+20000;
    	employee.setSalary(updatedSalary);
    	return employee;
    }
}
