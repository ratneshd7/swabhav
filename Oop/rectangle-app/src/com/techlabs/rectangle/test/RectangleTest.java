package com.techlabs.rectangle.test;

import com.techlabs.rectangle.Rectangle;

public class RectangleTest {
	public static void main(String[] args) {
		
		Rectangle small = new Rectangle();
		small.height=10;
		small.width=20;
		int area =small.calcArea();
		Rectangle big = new Rectangle();
		big.height=50;
		big.width=70;
		int area1 =big.calcArea();
		System.out.println("Rectangle has height="+small.height+" and width="+small.width+ "then area is=" + area);
		System.out.println("Rectangle has height="+big.height+" and width="+big.width+" then area is=" + area1);
	}
}
