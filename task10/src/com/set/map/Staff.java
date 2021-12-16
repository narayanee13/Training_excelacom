package com.set.map;

import java.util.*;
public class Staff {
 
	private String name;

	public Staff() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Staff(String name) {
		super();
		this.name = name;
	}
	@Override
	public String toString() {
		return "Staff [name=" + name + "]";
	}
	
}
