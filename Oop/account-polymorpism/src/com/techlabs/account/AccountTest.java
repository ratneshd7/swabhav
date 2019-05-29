package com.techlabs.account;

public class AccountTest {
	public static void main(String[] args) {
		Account acc = new SavingAccount("Ratnesh", 123456, 10000);
		acc.deposite(200);
		printDetails(acc);
		acc.withdraw(15000);
		printDetails(acc);

		Account acc1 = new CurrentAccount("Mahesh", 3456, 1000);
		acc.deposite(200);
		printDetails(acc1);
		acc.withdraw(5000);
		printDetails(acc1);
	}

	public static void printDetails(Account acc) {
		System.out.println("\nAccount Holder's name: " + acc.getName() + "\nAccount Number: " + acc.getAcc_no()
				+ "\nBalance: " + acc.getBalance());
	}
}
