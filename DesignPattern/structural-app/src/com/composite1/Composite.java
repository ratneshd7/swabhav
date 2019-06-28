package com.composite1;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

	String name;
	
	public Composite(String name) {
		super();
		this.name = name;
	}

	List<Component> component = new ArrayList<>();

	public void addComponent(Component com) {
		// TODO Auto-generated method stub
		component.add(com);
	}

	@Override
	public void getPrice() {
		// TODO Auto-generated method stub
		System.out.println(name);
		for (Component c : component) {
			c.getPrice();
		}
	}

}
