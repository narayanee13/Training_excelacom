package com.bank;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double amount;
		Scanner sc = new Scanner(System.in);
		amount = sc.nextDouble();
		sc.close();
		BankAccount sa = new SavingsAccount(1000);
		System.out.println("Savings Account");
		sa.deposit(amount);
		sa.withdraw(amount);
		System.out.println("current balance" + sa.getCurrentBalance());
		BankAccount ba = new BusinessAccount(10000);
		System.out.println("Business Account");
		ba.deposit(amount);
		ba.withdraw(amount);
		System.out.println("current balance" + sa.getCurrentBalance());

	}

}
