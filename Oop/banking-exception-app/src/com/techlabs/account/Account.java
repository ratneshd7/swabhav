package com.techlabs.account;

public class Account {
	private String accno, name;
	private double amount;

	public Account(String acc_no, String name, double amount) {

		this.accno = acc_no;
		this.name = name;
		this.amount = amount;
	}

	public Account(String acc_no, String name) {

		this(acc_no, name, 500);
	}

	public String getAcc_no() {
		return accno;
	}

	public String getName() {
		return name;
	}

	public double getAmount() {
		return amount;
	}

	public void deposite(double amount) {
		this.amount = this.amount + amount;
	}

	public void withdraw(double amount) {
		if ((this.amount - amount) < 500) {
			throw new InsufficientFundsException(this);
		}
		else{
			this.amount = this.amount - amount;
		}
	}
}
