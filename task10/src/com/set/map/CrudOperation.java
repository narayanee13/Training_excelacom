package com.set.map;

import java.util.*;

public interface CrudOperation<T> {
	public boolean add(T object);
	public HashSet<T> findAll();
	public T update(T object, String newDesignation);
	public boolean remove(T object);
}
