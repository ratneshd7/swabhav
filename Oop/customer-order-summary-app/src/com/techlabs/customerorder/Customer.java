package com.techlabs.customerorder;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String name;
	private List<Order> orders = new ArrayList<>();

	public Customer(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public List<Order> getOrders() {

		return orders;
	}

	public void addOrder(Order order) {
		// TODO Auto-generated method stub
		boolean isOrderExist=false;
		for (Order or : orders) {
			if(order.getOrderId()==or.getOrderId()) {
				or.addItems(order.getLineitems().get(0));
				isOrderExist=true;
				break;
			}
		}
		orders.add(order);
	}

	public void printOrderSummary(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("\nName: " + getName() + "\n\t\t\t\t" + getOrders());
	}

}
