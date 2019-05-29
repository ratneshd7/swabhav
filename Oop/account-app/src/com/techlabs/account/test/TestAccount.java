package com.techlabs.account.test;

import com.techlabs.account.Account;

public class TestAccount {
public static void main(String[] args) {
	Account acc1=new Account("12345678","Ratnesh",1000);
	acc1.withdraw(600);
	acc1.deposite(100);
	printdetails(acc1);
	acc1.withdraw(100);
	printdetails(acc1);
	System.out.println(acc1.toString());
	/*
	Account acc2=new Account("84554568","Ravi",1000);
	acc1.withdraw(100);
	printdetails(acc2);
	*/
}

private static void printdetails(Account acc1) {
	// TODO Auto-generated method stub
	System.out.println(acc1+"\nAccount number:"+acc1.getAcc_no()+"\nName:"+acc1.getName()+"\nAmount:"+acc1.getAmount());
}
}
