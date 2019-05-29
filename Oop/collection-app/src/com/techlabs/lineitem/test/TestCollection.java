package com.techlabs.lineitem.test;

import java.util.ArrayList;

import com.techlabs.lineitem.LineItem;

public class TestCollection {
	public static void main(String[] args) {
		
		ArrayList cart = new ArrayList();
		cart.add(new LineItem("Books", 100, 5));
		cart.add(new LineItem("Pen", 50, 4));
		cart.add(new LineItem("Pencil", 40, 10));
		cart.add("Ratnesh");
		cart.add(101);
		
		for(Object obj:cart){
			LineItem igm=(LineItem)obj;
			System.out.println("\nProduct:"+igm.getProduct()+"\n price:"+igm.getPrice()+"\nTotalPrice:"+igm.calTotalPrice()+"\nQuantity:"+igm.getQuantity());
		}
	}
}
