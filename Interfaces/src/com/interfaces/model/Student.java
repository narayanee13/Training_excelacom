package com.interfaces.model;

import com.example.interfaces.Conditional;

public class Student implements Conditional {
	
	private int id;
	private double mark;

	@Override
	public boolean test() {
		return this.mark >70;
	}

	public Student() {
		super();
	}

	public Student(int id, double mark) {
		super();
		this.id = id;
		this.mark = mark;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getMark() {
		return mark;
	}

	public void setMark(double mark) {
		this.mark = mark;
	}

}
