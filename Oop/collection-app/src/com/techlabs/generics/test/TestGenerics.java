package com.techlabs.generics.test;

import java.util.ArrayList;

import com.techlabs.lineitem.LineItem;

public class TestGenerics {
	public static void main(String[] args) {

		ArrayList<LineItem> cart1 = new ArrayList();
		cart1.add(new LineItem("Books", 100, 5));
		cart1.add(new LineItem("Pen", 50, 4));
		cart1.add(new LineItem("Pencil", 40, 10));
		
		for(Object obj:cart1){
			LineItem igm=(LineItem)obj;
			System.out.println("\nProduct:"+igm.getProduct()+"\n price:"+igm.getPrice()+"\nTotalPrice:"+igm.calTotalPrice()+"\nQuantity:"+igm.getQuantity());
		}
	}
}
