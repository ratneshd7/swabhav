package com.chap6;

import java.util.ArrayList;
import java.util.Scanner;

public class DotCom {
	public static void main(String[] args) {
		DotCom1 d = new DotCom1();
		ArrayList<String> s = new ArrayList<>();
		s.add("1");
		s.add("2");
		s.add("3");
		s.add("4");
		s.add("5");
		d.setLocationCells(s);
		Scanner sc=new Scanner(System.in);
		int b=s.size();
		int i=0;
		for( i=0;i<b;i++){
			System.out.print("enter a number");
			String result =d.checkYourself(sc.next());
			System.out.println(result);
		}
		System.out.println("no of guesses "+i);
	}
}

class DotCom1 {
	private ArrayList<String> locationCells;

	// private int numOfHits;
	// don’t need that now
	public void setLocationCells(ArrayList<String> loc) {
		locationCells = loc;
	}

	public String checkYourself(String userInput) {
		String result = "miss";
		int index = locationCells.indexOf(userInput);
		if (index >= 0) {
			locationCells.remove(index);
			if (locationCells.isEmpty()) {
				result = "kill";
			} else {
				result = "hit";
			} // close if
		} // close outer if
		return result;
	} // close method
} // close class
