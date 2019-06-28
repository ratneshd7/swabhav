package com.observer.test;

import com.observer.Account;
import com.observer.EmailNotifier;
import com.observer.SmsNotifier;

public class TestAccount {
	public static void main(String[] args) {
		Account account=new Account("Ratnesh", 1234, 10000);
		account.registerSubscribers(new EmailNotifier());
		account.withdraw(100);
		
		Account account1=new Account("Ram", 321, 1000);
		account1.registerSubscribers(new SmsNotifier());
		account1.withdraw(100);
		
		Account account2=new Account("Krishna", 421, 1000);
		account2.registerSubscribers(new SmsNotifier());
		account2.registerSubscribers(new EmailNotifier());
		account2.withdraw(1100);
		account2.deposite(20000);
	}
}
