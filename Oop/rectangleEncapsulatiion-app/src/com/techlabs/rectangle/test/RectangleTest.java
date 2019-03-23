package com.techlabs.rectangle.test;

import com.techlabs.rectangle.Rectangle;

public class RectangleTest {
	
	public static void main(String[] args) {

		Rectangle big = new Rectangle();
		big.setHeight(500);
		big.setWidth(70);
		big.setColor("Red");
		printDetails(big);

		Rectangle small = new Rectangle();
		small.setHeight(-10);
		small.setWidth(20);
		small.setColor("Blue");
		printDetails(small);

		Rectangle temp = big;
		temp.setHeight(10);
		System.out.println(temp.getHeight());
		System.out.println(big.getHeight());

		System.out.println("hash code of temp " + temp.hashCode());

		temp = null;
		System.out.println(big.getHeight());
		System.out.println(temp.getHeight());
	}

	public static void printDetails(Rectangle rect) {
		System.out.println("Rectangle has\nheight=" + rect.getHeight() + " and width=" + rect.getWidth()
				+ " Area is=" + rect.calcArea() + " color is=" + rect.getColor());
		System.out.println("hash code is " + rect.hashCode());
	}
}
