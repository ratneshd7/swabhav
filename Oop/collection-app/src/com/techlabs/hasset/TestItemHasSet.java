package com.techlabs.hasset;

import java.util.HashSet;

import com.techlabs.lineitem.LineItem;

public class TestItemHasSet {
	public static void main(String[] args) {
		HashSet<LineItem> set = new HashSet<>();
		set.add(new LineItem("Books", 100, 5));
		set.add(new LineItem("Books", 100, 5));
		set.add(new LineItem("Books", 100, 5));
		System.out.println(set.size());
		/*for(LineItem s:set){
		System.out.println("\nProduct:"+s.getProduct()+"\n price:"+s.getPrice()+"\nTotalPrice:"+s.calTotalPrice()+"\nQuantity:"+s.getQuantity());
		}*/

		HashSet<String> sset = new HashSet<>();
		sset.add("Book");
		sset.add("Book");
		sset.add("Book");
		System.out.println(sset.size());
	}
}
