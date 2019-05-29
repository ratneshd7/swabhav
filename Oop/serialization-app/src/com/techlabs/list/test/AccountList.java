package com.techlabs.list.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.techlabs.account.*;

public class AccountList {
	public static void main(String[] args) {
		ArrayList<Account> list = new ArrayList<>();
		Account acc1 = new Account("1234", "Ratnesh Dubey", 2000, "Borivali");
		Account acc2 = new Account("12345", "Dubey", 4000, "kandivali");
		Account acc3 = new Account("123456", "Shree", 6000, "goregaon");
		Account acc4 = new Account("1234567", "manoj", 8000, "Anderi");
		list.add(acc1);
		list.add(acc2);
		list.add(acc3);
		list.add(acc4);

		try {
			FileOutputStream fs=new FileOutputStream("DataFile\\AccList.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(list);
			os.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
