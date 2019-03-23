package com.techlabs.rectangle;

public class Rectangle {
	private int height, width;
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {

		this.color = checkColor(color);
	}

	private String checkColor(String colorValue) {
		// TODO Auto-generated method stub
		if (colorValue.toLowerCase().equals("red") || colorValue.equalsIgnoreCase("blue")
				|| colorValue.toLowerCase().equals("green"))
			return colorValue;
		return "Red";
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {

		this.height = validate(height);
	}

	private int validate(int value) {
		// TODO Auto-generated method stub
		if (value < 1) {
			return 1;
		} else if (value > 100)
			return 100;
		else
			return value;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {

		this.width = validate(width);

	}

	public int calcArea() {
		return height * width;
	}
}
