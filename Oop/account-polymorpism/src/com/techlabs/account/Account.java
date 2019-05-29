package com.techlabs.account;

abstract class Account {
	private String name;
	private int acc_no;
	protected double balance;

	public Account(String name, int acc_no, double balance) {
		super();
		this.name = name;
		this.acc_no = acc_no;
		this.balance = balance;
	}

	abstract void withdraw(double amount);

	public void deposite(double amount) {
		this.balance = this.balance + amount;
	}

	public String getName() {
		return name;
	}

	public int getAcc_no() {
		return acc_no;
	}

	public double getBalance() {
		return balance;
	}

	
}
