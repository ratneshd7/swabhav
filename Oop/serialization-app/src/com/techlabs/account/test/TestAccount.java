package com.techlabs.account.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.techlabs.account.Account;

public class TestAccount {
	public static void main(String[] args) {
		
		Account acc1 = new Account("12345678", "Ratnesh", 1000,"delhi");
		acc1.withdraw(600);
		acc1.deposite(100);
		printdetails(acc1);
		acc1.withdraw(100);
		printdetails(acc1);
		System.out.println(acc1.toString());
		try {
			FileOutputStream output = new FileOutputStream("DataFile\\Bank.ser");
			ObjectOutputStream os = new ObjectOutputStream(output);
			os.writeObject(acc1);
			os.close();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	

	public static void printdetails(Account acc1) {
		// TODO Auto-generated method stub
		System.out.println(acc1 + "\nAccount number:" + acc1.getAcc_no() + "\nName:" + acc1.getName() + "\nAmount:"
				+ acc1.getAmount()+"\nLocation="+acc1.getLocation());
	}
}
