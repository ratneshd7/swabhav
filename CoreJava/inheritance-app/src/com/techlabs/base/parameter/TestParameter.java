package com.techlabs.base.parameter;

public class TestParameter {
public static void main(String[] args) {
	Inherited i = new Inherited();
	System.out.println(i.getData());
	
	Inherited i2=new Inherited(200);
	System.out.println(i2.getData());
}
}
