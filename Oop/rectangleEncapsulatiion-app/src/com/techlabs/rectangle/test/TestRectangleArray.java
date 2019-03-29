package com.techlabs.rectangle.test;

import com.techlabs.rectangle.Rectangle;

public class TestRectangleArray {

	public static void main(String[] args) {
		int sum = 0;
		Rectangle[] array = new Rectangle[5];
		array[0] = new Rectangle();
		array[1] = new Rectangle();
		array[2] = new Rectangle();
		array[3] = new Rectangle();
		array[4] = new Rectangle();
                                                  
		array[0].setHeight(10);
		array[1].setHeight(20);
		array[2].setHeight(30);
		array[3].setHeight(40);
		array[4].setHeight(50);

		array[0].setWidth(10);
		array[1].setWidth(20);
		array[2].setWidth(30);
		array[3].setWidth(40);
		array[4].setWidth(50);

		array[0].setColor("Blue");
		array[1].setColor("Green");
		array[2].setColor("Red");
		array[3].setColor("Blue");
		array[4].setColor("yellow");

		for (Rectangle rect : array) {
			RectangleTest.printDetails(rect);
			System.out.println();
			sum = sum + rect.calcArea();
		}
		System.out.println("sum of areas are:" + sum);
	}
}