package com.techlabs.account.test;

import com.techlabs.account.Account;

public class TestEquality {
	public static void main(String[] args) {
		Account acc1 = new Account("101", "ABC");
		Account acc2 = new Account("101", "ABC");
		Account acc3 = new Account("102", "ABC");
		System.out.println(acc1 == acc1);
		System.out.println(acc1 == acc2);

		System.out.println(acc1.equals(acc1));
		System.out.println(acc1.equals(acc2));
		System.out.println(acc1.equals(acc3));
		System.out.println(acc2.equals(acc3));

	}
}
