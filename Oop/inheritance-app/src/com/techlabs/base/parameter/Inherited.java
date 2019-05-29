package com.techlabs.base.parameter;

public class Inherited extends Base {
	public Inherited() {
		super(5);
		System.out.println("inside inherited");

	}

	public Inherited(int data) {
		super(data);
		System.out.println("inside parameterised constructor");
	}
}
