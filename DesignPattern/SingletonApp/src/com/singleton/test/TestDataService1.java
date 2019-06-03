package com.singleton.test;

import com.singletonapp.DataService1;

public class TestDataService1 {
	public static void main(String[] args) {
		DataService1 sv1 = DataService1.getInstance();
		DataService1 sv2=DataService1.getInstance();
		
		sv1.doSomething();
		sv2.doSomething();
		
		System.out.println(sv1.hashCode());
		System.out.println(sv2.hashCode());
	}
}
