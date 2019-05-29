package com.techlabs.account.test;

import com.techlabs.account.Account;

public class TestAccount {
	public static void main(String[] args) {
		Account acc1 = new Account("12345678", "Ratnesh", 1000);
		
		acc1.withdraw(600);
		acc1.deosite(100);
		printdetails(acc1);
		acc1.withdraw(100);
		printdetails(acc1);
		
		System.out.println(acc1);
		System.out.println(acc1.toString());

		Account acc2 = new Account("84554568", "Ravi", 1000);
		acc1.withdraw(100);

		System.out.println(acc2);
		System.out.println(acc2.toString());
	}

	private static void printdetails(Account acc1) {
		// TODO Auto-generated method stub
		System.out.println(
				"Account number:" + acc1.getAccno() + "\nName:" + acc1.getName() + "\nAmount:" + acc1.getAmount());
	}
}
