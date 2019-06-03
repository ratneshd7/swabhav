package com.techlabs.account.test;

import com.techlabs.account.Account;

public class TestToString {
	public static void main(String[] args) {
		Account acc1 = new Account("12345678", "Ratnesh", 1000);
		System.out.println(acc1.toString());
	}
}
