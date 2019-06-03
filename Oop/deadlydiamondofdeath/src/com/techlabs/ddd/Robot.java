package com.techlabs.ddd;

//public class Robot extends Dog,Lion---> This will ceate ddd
// so use interface to solve this problem
public class Robot extends Dog implements Animal {
	public void run() {
		System.out.println("robot run");
	}
}
