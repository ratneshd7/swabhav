package com.techlabs.exception;

public class TestExceptionPropogation {
	public static void main(String[] args) throws Exception {
		try {
			m1();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("End of main");
	}

	private static void m1() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("inside m1");
		m2();
	}

	private static void m2() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("inside m2");
		m3();
	}

	private static void m3() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("inside m3");
		throw new Exception("m3 failed");
	}
}
