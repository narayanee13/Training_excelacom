package com.bank;

public class BusinessAccount extends BankAccount {
	
	public BusinessAccount(double currentBalance) {
		super(currentBalance);
	}

	@Override
	public double deposit(double amount) {
		if (amount <= 1000000) {
			setCurrentBalance(getCurrentBalance()+amount);
			System.out.println("deposit money");
		} else {
			System.out.println("maximum money to deposit is 1000000");
		}
		return this.getCurrentBalance();
	}

	@Override
	public double withdraw(double amount) {
		if (amount>25000) {
			setCurrentBalance(getCurrentBalance()-amount);
			System.out.println("withdraw amount");
		}
		else {
			System.out.println("minimum balance should be 100000");
	}
	 return this.getCurrentBalance();
	
}
}