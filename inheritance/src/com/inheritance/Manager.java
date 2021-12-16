package com.inheritance;

public class Manager extends Employee {
	private String[] skillset;

	public Manager(int employeeId, String employeeName, String designation, double salary, String[] skillset) {
		super(employeeId, employeeName, designation, salary);
		this.skillset = skillset;
	}

	public Manager() {
		super();
	}

	public String[] getSkillset() {
		return skillset;
	}

	public void setSkillset(String[] skillset) {
		this.skillset = skillset;
	}
}
