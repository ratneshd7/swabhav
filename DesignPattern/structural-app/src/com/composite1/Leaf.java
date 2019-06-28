package com.composite1;

public class Leaf implements Component {
	int price;
	String name;
	public Leaf(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}
	@Override
	public void getPrice() {
		// TODO Auto-generated method stub
		System.out.println(name+":"+price);
	}
	
}
