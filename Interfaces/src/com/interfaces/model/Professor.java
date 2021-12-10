package com.interfaces.model;

import com.example.interfaces.Conditional;

public class Professor implements Conditional {
	
	private int id;
	private String qualification;

	@Override
	public boolean test() {
		return this.qualification.equalsIgnoreCase("mca");
	}

	public Professor() {
		super();
	}

	public Professor(int id, String qualification) {
		super();
		this.id = id;
		this.qualification = qualification;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

}
