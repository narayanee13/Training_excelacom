package com.crud;

import java.util.List;

import com.collections.model.Student;

public interface CrudRepository<T> {
	
	public boolean add(T object);
	public List<T> findAll();
	public T update(T object, double revisedMark);
	public boolean remove(T object);

}
