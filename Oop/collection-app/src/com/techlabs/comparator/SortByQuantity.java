package com.techlabs.comparator;

import java.util.Comparator;

import com.techlabs.lineitem.LineItem;

public class SortByQuantity implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		LineItem l1 = (LineItem) o1;
		LineItem l2 = (LineItem) o2;

		if (l1.getQuantity() == l2.getQuantity())
			return 0;
		else if (l1.getQuantity() < l2.getQuantity())
			return 1;
		else
			return -1;

	}
}
