package com.techlabs.customerorder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	private Date date;
	private int orderId;
	
	private List<LineItem> items = new ArrayList<>();;

	public List<LineItem> getItems() {
		return items;
	}

	public Order(Date date, int id, LineItem item) {
		// TODO Auto-generated constructor stub
		this.date = date;
		this.orderId = id;
		boolean isItemExist = false;
		addItems(item);
																																/*if(true){
																																for (LineItem item1 : items) {
																																	System.out.println(item1);
																																	if (item1.equals(item.getProduct().getName())) {
																																	item1.setQuantity(item1.getQuantity()+item.getQuantity());
																																	//System.out.println(item1.getQuantity()+item.getQuantity());
																																		this.flag=1;
																																		break;
																																	}
																																	
																																}
																																}
																																if(this.flag==0){
																																	
																																	//System.out.println(item.getQuantity());
																																addItems(item);}
																															*/
		}
	
	public int getOrderId() {
		return orderId;
	}

	public void addItems(LineItem item) {
		boolean isItemExist = false;
			for (LineItem item1 : items) {
																											//System.out.println(item1);
				if (item1.getProduct().getName().equals(item.getProduct().getName())) {
				item1.setQuantity(item1.getQuantity()+item.getQuantity());
				//System.out.println(item1.getQuantity()+item.getQuantity());
				 isItemExist = true;
					break;
				}
				
			}
			
			if(!isItemExist){
			items.add(item);}
	}
																									/*
																									 * public void addItems(LineItem item) { // TODO Auto-generated method stub
																									 * 
																									 * for (LineItem item1 : items) {
																									 * if(item1.equals(item.getProduct().getName())){ int i=items.getQuantity();
																									 * item1.setQuantity(i+1); } else items.add(item); } }
																									 */
	public double checkOutPrice() {
		// TODO Auto-generated method stub
		double price = 0;
		for (LineItem it : items) {
			price = price + it.totalCost();
		}
		return price;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.getOrderId() == ((Order) obj).getOrderId();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nDate:  " + date + "\t\t OrderId: " + orderId + "\n" + items+"\n\t\tCheckout Price: " + checkOutPrice()+"\n";
	}

	public List<LineItem> getLineitems() {
		// TODO Auto-generated method stub
		return items;
	}
}
