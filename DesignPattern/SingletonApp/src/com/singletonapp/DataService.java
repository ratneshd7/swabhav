package com.singletonapp;

public class DataService {
	public DataService() {
		System.out.println("Service Created");

	}

	public void doSomething() {
		System.out.println("Doing Something By" + this.hashCode());
	}
}
