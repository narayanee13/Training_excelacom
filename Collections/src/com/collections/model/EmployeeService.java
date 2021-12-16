package com.collections.model;

import java.util.List;

import com.crud.CrudRepository;

public class EmployeeService implements CrudRepository<Employee> {

	@Override
	public boolean add(Employee object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee update(Employee object, double revisedMark) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Employee object) {
		// TODO Auto-generated method stub
		return false;
	}

}
