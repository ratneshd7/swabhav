package com.rectangle.constructor.borderstyle;

// if problem definition says to use read only 
//then use constructor for initializing and getter to get the value
//and make variable final
public class RectangleConstructorBorderstyle {
	final private BorderStyles border;
	final private int height, width;

	public BorderStyles getBorder() {
		return border;
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	public RectangleConstructorBorderstyle(int height, int width, BorderStyles border) {
		this.border = border;
		this.height = height;
		this.width = width;

	}

	public RectangleConstructorBorderstyle(int height, int width) {
		this.border = BorderStyles.SINGLE;
		this.height = height;
		this.width = width;

	}

}
