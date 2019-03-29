package com.techlabs.circle;

public class Circle {
	private String color;
	private float radius;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public float pi = 3.14f;

	public Double calArea() {
		return (3.14 * radius * radius);
	}

}
