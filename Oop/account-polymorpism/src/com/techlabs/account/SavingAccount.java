package com.techlabs.account;

public class SavingAccount extends Account {

	public SavingAccount(String name, int acc_no, double balance) {
		super(name, acc_no, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	void withdraw(double amount) {
		// TODO Auto-generated method stub
		if ((balance - amount) <= 500) {
			System.out.println("Unsufficient Account Balnace");
		} else {
			balance = balance - amount;
			System.out.println("Transaction Completed Successfully");
		}
	}

}
