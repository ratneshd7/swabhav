package com.demo.oddeven.test;

import java.util.Scanner;
import com.demo.oddeven.OddEven;

public class OddEvenTest {

	public static void main(String[] args) {
		OddEven oddeven = new OddEven();
		Scanner sc = new Scanner(System.in);
		oddeven.setNumber(sc.nextInt());

		oddeven.printEven(oddeven.getNumber());
		oddeven.printOdd(oddeven.getNumber());
	}
}