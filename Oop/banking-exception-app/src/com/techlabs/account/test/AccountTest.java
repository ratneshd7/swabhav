package com.techlabs.account.test;

import java.util.ArrayList;

import com.techlabs.account.Account;
import com.techlabs.account.InsufficientFundsException;

public class AccountTest {
	public static void main(String[] args) {
		Account acc = new Account("12345678", "Ratnesh", 1000);
		try {
			acc.withdraw(1000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		printdetails(acc);
		
		/*ArrayList a=new ArrayList();// object type array
		a.add(4);
		a.add("r");*/
	}

	private static void printdetails(Account acc1) {
		// TODO Auto-generated method stub
		System.out.println(/*acc1.getClass().getSimpleName()*/"\nAccount number:"+acc1.getAcc_no()+"\nName:"+acc1.getName()+"\nAmount:"+acc1.getAmount());
	
	}
}
