package com.techlabs.account;

public class CurrentAccount extends Account {

	public CurrentAccount(String name, int acc_no, double balance) {
		super(name, acc_no, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	void withdraw(double amount) {
		// TODO Auto-generated method stub
		if ((balance - amount) <= -2000) {
			System.out.println("Unsufficient Account Balnace");
		} else {
			balance = balance - amount;
			System.out.println("Transaction Completed Successfully");
		}
	}

}
