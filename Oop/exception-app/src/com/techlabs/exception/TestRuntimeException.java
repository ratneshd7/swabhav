package com.techlabs.exception;

public class TestRuntimeException {
	public static void main(String[] args) {
		m1();

		System.out.println("End of main");
	}

	private static void m1() {
		// TODO Auto-generated method stub
		System.out.println("inside m1");
		m2();
	}

	private static void m2() {
		// TODO Auto-generated method stub
		System.out.println("inside m2");
		m3();
	}

	private static void m3() {
		// TODO Auto-generated method stub
		System.out.println("inside m3");
		throw new RuntimeException("m3 failed");
	}

}
