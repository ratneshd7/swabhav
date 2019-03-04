package com.techlabs.basic;

public class TestOverloading {
	private static void printThis(int x) {
		System.out.println("Overloading 1");
		System.out.println(x);
	}

	private static void printThis(double x) {
		System.out.println("Overloading 2");
		System.out.println(x);
	}

	private static void printThis(float x) {
		System.out.println("Overloading 3");
		System.out.println(x);
	}

	private static void printThis(String x) {
		System.out.println("Overloading 4");
		System.out.println(x);
	}

	private static void printThis(boolean x) {
		System.out.println("Overloading 5");
		System.out.println(x);
	}

	public static void main(String[] args) {
		printThis(10);
		printThis(10.5);
		printThis(10.5f);
		printThis("Hello");
		printThis(true);

	}
}
