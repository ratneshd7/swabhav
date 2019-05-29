package com.techlabs.treeset;

import java.util.TreeSet;

import com.techlabs.comparator.SortByPrice;
import com.techlabs.comparator.SortByQuantity;
import com.techlabs.lineitem.LineItem;

public class TestTreeSet {
	public static void main(String[] args) {
		TreeSet<LineItem> tset = new TreeSet<>(new SortByQuantity());
		tset.add(new LineItem("Books", 100, 1));
		tset.add(new LineItem("Books", 100, 3));
		tset.add(new LineItem("Books", 100, 3));

		System.out.println(tset.size());
		TreeSet<LineItem> tset2 = new TreeSet<>(new SortByPrice());
		tset2.add(new LineItem("Books", 100, 5));
		tset2.add(new LineItem("Books", 101, 5));
		tset2.add(new LineItem("Books", 102, 5));
		System.out.println(tset2.size());
		
		System.out.println(tset);
		System.out.println();
		System.out.println(tset2);
	}
}
