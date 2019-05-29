package com.techlabs.list.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import com.techlabs.account.Account;
import com.techlabs.account.test.TestAccount;

public class AccountListTest {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("DataFile\\AccList.ser");
			TestAccount ts = new TestAccount();
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object one = ois.readObject();
			ArrayList<Account> obj = (ArrayList<Account>) one;
			for (Account account : obj) {
				ts.printdetails(account);
			}
			ois.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
