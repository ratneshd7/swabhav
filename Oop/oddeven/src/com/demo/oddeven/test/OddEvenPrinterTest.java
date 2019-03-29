package com.demo.oddeven.test;

import java.util.Scanner;
import com.demo.oddeven.OddEvenPrinter;

public class OddEvenPrinterTest {

	public static void main(String[] args) {
		OddEvenPrinter oddeven = new OddEvenPrinter();
		Scanner sc = new Scanner(System.in);
		oddeven.setNumber(sc.nextInt());

		oddeven.printEven(oddeven.getNumber());
		oddeven.printOdd(oddeven.getNumber());
	}
}
