package com.string.exception;

public class Customer {
	private int customerId;
	private String customerName;
	private String email;
	private double phoneNumber;
	
	public Customer() {
		super();
	}
	public Customer(int customerId, String customerName, String email, double phoneNumber)throws InvalidEmailException {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		
		if((email.contains("@")) && ((email.contains(".com")|| email.contains(".in")))) {
			this.email=email;	
		}else {
			try {
				throw new InvalidEmailException("email should have @ and .com or .in");
			} catch (InvalidEmailException e) {
				e.printStackTrace();
			}	
	}
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if ((email.contains("@")) && ((email.contains(".com") || email.contains(".in")))) {
			this.email = email;
		} else {
			try {
				throw new InvalidEmailException("email should have @ and .com or .in");
			} catch (InvalidEmailException e) {
				e.printStackTrace();
			}		
		}
	}

	public double getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(double phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	

}
