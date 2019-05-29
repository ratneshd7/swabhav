package com.techlabs.orderitem;

import java.util.LinkedHashSet;

public class TestLinkedHashset {
	public static void main(String[] args) {
		LinkedHashSet<String> linkedset = new LinkedHashSet<String>();

		// Adding element to LinkedHashSet
		linkedset.add("Amit");
		linkedset.add("Brijesh");

		// This will not add new element as A already exists
		linkedset.add("Amit");
		linkedset.add("Elephant");

		System.out.println("Size of LinkedHashSet = " + linkedset.size());
		System.out.println("Original LinkedHashSet:" + linkedset);
		System.out.println("Removing Brijesh from LinkedHashSet: " + linkedset.remove("Brijesh"));
		
		System.out.println("Updated LinkedHashSet: " + linkedset);
		
		
	}
}
