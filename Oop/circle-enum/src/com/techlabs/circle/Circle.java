package com.techlabs.circle;

public class Circle {
	private ColorCategories color;
	private float radius;
	public float pi = 3.14f;

	public ColorCategories getColor() {
		return color;
	}

	public void setColor(ColorCategories color) {
		this.color = color;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public Double calArea() {
		return (3.14 * radius * radius);
	}

}
