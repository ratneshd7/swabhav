package com.techlabs.basic;

public class TestMutation {
	public static void main(String[] args) {
		int mark = 100;
		changeToZero(mark);
		System.out.println(mark);
		int[] marks = { 10, 20, 30 };
		changeToZero(marks);
		for (int m : marks) {
			System.out.println(m);
		}
	}

	private static void changeToZero(int m) {
		m = 0;
	}

	private static void changeToZero(int[] mks) {
		for (int i = 0; i < mks.length; i++) {
			mks[i] = 0;
		}
	}

}
