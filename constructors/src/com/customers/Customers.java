package com.customers;

public class Customers {
 public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public double getBill() {
		return bill;
	}
	public void setBill(double bill) {
		this.bill = bill;
	}
public Customers(String customerName, int customerId, double bill) {
		super();
		this.customerName = customerName;
		this.customerId = customerId;
		this.bill = bill;
	}
private String customerName;
 private int customerId;
 private double bill;
public Customers() {
	super();
	// TODO Auto-generated constructor stub
}
}
