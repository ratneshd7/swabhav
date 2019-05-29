package com.techlabs.abstractexample;

abstract class Shape {
	int color;

	abstract void draw();

}

class Rectangle extends Shape {
	void draw() {
		System.out.println("Draw Rectangle");
	}
	public static void main(String[] args) {
		Shape shape=new Rectangle();
		shape.draw();
	}
}
