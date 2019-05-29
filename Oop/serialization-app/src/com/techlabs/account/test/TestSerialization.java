package com.techlabs.account.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

import com.techlabs.account.Account;

public class TestSerialization {
public static void main(String[] args) {
	
	try {
		System.out.println("file reading from bank.ser");
		FileInputStream fis = new FileInputStream("DataFile\\Bank.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
	
		Object one = ois.readObject();
		Account obj=(Account)one;
		TestAccount ta=new TestAccount();
		ta.printdetails(obj);
		ois.close();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
