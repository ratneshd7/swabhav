package com.chap16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestArrayList {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("ratnesh");
		list.add("rahul");
		list.add("abhishek");
		list.add("chandan");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}