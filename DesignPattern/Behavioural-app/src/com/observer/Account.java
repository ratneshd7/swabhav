package com.observer;

import java.awt.List;
import java.util.ArrayList;

public class Account {
	private String name;
	private int accno;
	private int balance;

	private ArrayList<IBalanceChangeNotifier> subscribers = new ArrayList<>();

	public Account(String name, int accno, int balance) {
		super();
		this.name = name;
		this.accno = accno;
		this.balance = balance;

	}

	public String getName() {
		return name;
	}

	public void withdraw(int amt) {

		if (this.balance - amt >= 0)
			this.balance = this.balance - amt;
		else
			System.out.println("Insufficient Account Balance");

		for (IBalanceChangeNotifier obj : subscribers)
			obj.update(this);
	}

	public void deposite(int amt) {

		this.balance = this.balance + amt;
		for (IBalanceChangeNotifier obj : subscribers)
			obj.update(this);
	}

	public void registerSubscribers(IBalanceChangeNotifier obj) {

		subscribers.add(obj);

	}
	public String getInfo() {
		// TODO Auto-generated method stub
   
		return "Name: "+name +"\tAccount No: "+accno+"\t\tBalance: "+balance+"\n";
		
	}

}
