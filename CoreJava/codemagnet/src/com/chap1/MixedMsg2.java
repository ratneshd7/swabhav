package com.chap1;

public class MixedMsg2 {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		while (x < 5) {
			y = y + 2;
			if (y > 4)
				y--;
			System.out.print(x + "" + y + " ");
			x = x + 1;
		}
	}
}