package com.demo.oddeven;

import java.util.Scanner;

public class OddEvenPrinter {
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void printEven() {
		// TODO Auto-generated method stub
		System.out.println("Even Numbers are:");
		for(int count=0;count<=number;count++){
			if(count%2==0)
			System.out.println(count);
		}
	}

	public void printOdd() {
		// TODO Auto-generated method stub
		System.out.println("Odd Numbers are:");
		for(int count=0;count<=number;count++){
			if(count%2!=0)
			System.out.println(count);
		}
	}

}
