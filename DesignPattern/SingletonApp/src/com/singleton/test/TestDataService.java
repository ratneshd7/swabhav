package com.singleton.test;

import com.singletonapp.DataService;

public class TestDataService {
	public static void main(String[] args) {
		DataService sv1 = new DataService();
		DataService sv2 = new DataService();
		
		sv1.doSomething();
		sv2.doSomething();
		
		System.out.println(sv1.hashCode());
		System.out.println(sv2.hashCode());
	}
}
