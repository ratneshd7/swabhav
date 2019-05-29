package com.techlabs.base.parameter;

public class Base {
	int data;

	public Base(int data) {
		System.out.println("inside base");
		this.data = data;

	}

	public int getData() {
		return data;
	}
}
