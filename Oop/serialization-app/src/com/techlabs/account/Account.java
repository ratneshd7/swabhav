package com.techlabs.account;

import java.io.Serializable;

public class Account implements Serializable {
private	 static final long serialVersionUID = -1349860817921031473L;

	private String accno, name;
	private double amount;
	private String location;
	

	public Account(String acc_no, String name, double amount,String locate) {

		this.accno = acc_no;
		this.name = name;
		this.amount = amount;
		this.location=locate;
	}

	public Account(String acc_no, String name) {

		this(acc_no, name, 500,"mumbai");
	}

	public String getAcc_no() {
		return accno;
	}

	public String getName() {
		return name;
	}
	public String getLocation() {
		return location;
	}
	public double getAmount() {
		return amount;
	}

	public void deposite(double amount) {
		this.amount = this.amount + amount;
	}

	public void withdraw(double amount) {
		if ((this.amount - amount) < 500) {
		}
		else{
			this.amount = this.amount - amount;
		}
	}
}
