package com.techlabs.circle.test;

import com.techlabs.circle.Circle;

public class CircleTest {

	public static void main(String[] args) {
		Circle c = new Circle();

		c.setRadius(2.5f);
		c.setColor("RED");
		printDetails(c);

		c.setColor("GREEN");
		c.setRadius(3.5f);
		printDetails(c);
	}

	public static void printDetails(Circle c) {
		// TODO Auto-generated method stub
		System.out.println("Area=" + c.calArea() + "\nColor=" + c.getColor());
	}
}
