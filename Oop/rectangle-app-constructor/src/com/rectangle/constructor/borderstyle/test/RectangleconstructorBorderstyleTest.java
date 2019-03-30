package com.rectangle.constructor.borderstyle.test;

import com.rectangle.constructor.borderstyle.BorderStyles;
import com.rectangle.constructor.borderstyle.RectangleConstructorBorderstyle;

public class RectangleconstructorBorderstyleTest {
	public static void main(String[] args) {

		RectangleConstructorBorderstyle rectangle = new RectangleConstructorBorderstyle(10, 20, BorderStyles.DOTTED);
		calculateArea(rectangle);

		RectangleConstructorBorderstyle rectangle1 = new RectangleConstructorBorderstyle(10, 10);
		calculateArea(rectangle1);

		rectangle = new RectangleConstructorBorderstyle(20, 20, BorderStyles.DOUBLE);
		calculateArea(rectangle);
		//direct object  passing into method
		calculateArea(new RectangleConstructorBorderstyle(9, 20,BorderStyles.SINGLE));

	}

	private static void calculateArea(RectangleConstructorBorderstyle rectangle) {
		// TODO Auto-generated method stub
		System.out.println(
				"Area=" + rectangle.getHeight() * rectangle.getWidth() + " BorderStyle=" + rectangle.getBorder());
		System.out.println("hashcode=" + rectangle.hashCode());
	}

}
