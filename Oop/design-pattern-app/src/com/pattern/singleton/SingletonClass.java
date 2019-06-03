package com.pattern.singleton;

public class SingletonClass {
	int a = 5;
	int b = 10;
	public static SingletonClass singletonClass = new SingletonClass();

	private SingletonClass() {

	}

	public static SingletonClass getInstance() {
		return singletonClass;
	}

	public void sum() {
		// TODO Auto-generated method stub
		System.out.println(a + b);
	}
}
