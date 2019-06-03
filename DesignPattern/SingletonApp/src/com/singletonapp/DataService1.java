package com.singletonapp;

public class DataService1 {
	private static DataService1 container;// for solution

	private DataService1() {
		System.out.println("Service Created");

	}

	public void doSomething() {
		System.out.println("Doing Something By" + this.hashCode());
	}

	public static DataService1 getInstance() {
		if (container == null)
			container = new DataService1();

		return container;// for solution
		// return new DataService1
	}
}
