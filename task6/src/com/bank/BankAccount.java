package com.bank;

public abstract class BankAccount {
    private double currentBalance;
	public double getCurrentBalance() {
		return currentBalance;
	}
	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}
	public BankAccount(double currentBalance) {
		super();
		this.currentBalance = currentBalance;
	}
	public abstract double deposit(double amount);
	public abstract double withdraw(double amount);
}
 