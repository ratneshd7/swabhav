package com.techlabs.basic;

public class TestArguments {
	public static void main(String[] args) {
		if (args.length == 0)
			System.out.println("No Argument has been passed");
		else {

			/*
			 * for (int i = 0; i < args.length; i++) {
			 * 
			 * System.out.println("hello "+args[i]);
			 */

			for (String s : args) {
				System.out.println("hello " + s);
			}

		}

	}
}
