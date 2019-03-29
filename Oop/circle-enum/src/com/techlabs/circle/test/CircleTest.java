package com.techlabs.circle.test;

import com.techlabs.circle.Circle;
import com.techlabs.circle.ColorCategories;

public class CircleTest {
	public static void main(String[] args) {
		Circle circle = new Circle();

		circle.setRadius(2.5f);
		circle.setColor(ColorCategories.BLUE);
		printDetails(circle);

		circle.setColor(ColorCategories.GREEN);
		circle.setRadius(3.5f);
		printDetails(circle);
	}

	public static void printDetails(Circle c) {
		// TODO Auto-generated method stub
		System.out.println("Area=" + c.calArea() + "\nColor=" + c.getColor() + "\n");
	}
}
