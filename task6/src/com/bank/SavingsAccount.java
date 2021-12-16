package com.bank;

public class SavingsAccount extends BankAccount {
	
  
    public SavingsAccount(double currentBalance) {
		super(currentBalance);
	}
	@Override
	public double deposit(double amount) {
		if (amount<=100000) {
	     setCurrentBalance(getCurrentBalance()+amount);
		 System.out.println("deposit money");
		}
		else 
		 System.out.println("maximum money to deposit is 25000");
	return this.getCurrentBalance();
    }
	@Override
	public double withdraw(double amount) {
		if (amount>5000) {
			setCurrentBalance(getCurrentBalance()-amount);
			System.out.println("withdraw amount");
		}
		else {
			System.out.println("minimum balance should be 5000");
	}
	 return this.getCurrentBalance();	
	
}
}
