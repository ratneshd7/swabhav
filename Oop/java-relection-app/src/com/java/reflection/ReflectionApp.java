package com.java.reflection;

public class ReflectionApp {
	private String name;
	public int t;
	//final ReflectionApp s;

	public String getName() {
		return name;
	}

	public ReflectionApp(String s) {
		this.name=s;
	}

	public void area() {
		System.out.println("Area");
	}

	public int sayHii() {
		return 1;
	}

}
