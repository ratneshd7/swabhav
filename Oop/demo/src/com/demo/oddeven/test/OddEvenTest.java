package com.demo.oddeven.test;

import java.util.Scanner;
import com.demo.oddeven.OddEven;

public class OddEvenTest {

	public static void main(String[] args) {
		OddEven oddeven = new OddEven();
		Scanner sc = new Scanner(System.in);
		oddeven.setNumber(sc.nextInt());

		int even[] = new int[oddeven.getNumber() / 2 + 1];
		int odd[] = new int[oddeven.getNumber() / 2];

		 int k = 0, j = 0;
		for (int i = 0; i <= oddeven.getNumber(); i++) {
			if (i % 2 == 0) {
				even[k] = i;
				k++;
			} else {
				odd[j] = i;
				j++;
			}
		}
		System.out.println("Even numbers are:");
		for (int i = 0; i < even.length; i++) {
			System.out.println(even[i]);
		}
		System.out.println("Odd numbers are:");
		for (int i = 0; i < odd.length; i++) {
			System.out.println(odd[i]);
		}
	}
}
