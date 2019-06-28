package com.composite.test;

import com.composite1.Component;
import com.composite1.Composite;
import com.composite1.Leaf;

public class TestComposite {
	public static void main(String[] args) {
		Component cp = new Leaf(100, "mouse");
		Component ram = new Leaf(2000, "Ram");

		Composite ph = new Composite("perl");
		Composite mb=new Composite("cpu");
		
		mb.addComponent(ram);
		ph.addComponent(cp);
		
		cp.getPrice();
		mb.getPrice();
		
		ph.getPrice();
		
		

	}
}
