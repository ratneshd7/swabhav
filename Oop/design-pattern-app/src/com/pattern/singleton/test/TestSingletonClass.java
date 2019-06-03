package com.pattern.singleton.test;

import com.pattern.singleton.SingletonClass;

public class TestSingletonClass {
private static SingletonClass obj=null;
	public static void main(String[] args) {
		obj=obj.getInstance();
		obj.sum();
	}
}
