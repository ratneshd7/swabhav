package com.techlabs.orderitem;

public class OrderItem {
	private String product;
	private int price;
	private int quantity;

	public OrderItem(String prod, int price, int qty) {
		// TODO Auto-generated constructor stub
		this.product = prod;
		this.price = price;
		this.quantity = qty;

	}

	public String getProduct() {
		return product;
	}

	public int getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nProduct:"+getProduct()+"\n price:"+getPrice()+"\nQuantity:"+getQuantity();
	}
}
