package com.java.reflection;

public class ReflectionApp {
	private String name;
	private int height;
	private int width;
	//final ReflectionApp s;

	public String getName() {
		return name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public ReflectionApp(){
		
	}
	public ReflectionApp(String s) {
		this.name=s;
	}

}
