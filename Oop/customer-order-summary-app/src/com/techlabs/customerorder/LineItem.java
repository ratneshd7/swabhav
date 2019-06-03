package com.techlabs.customerorder;

public class LineItem {
	private int itemId;
	private int quantity;
	private Product product;

	public LineItem(int id, int quantity, Product prod) {
		// TODO Auto-generated constructor stub
		this.itemId = id;
		this.quantity = quantity;
		this.product = prod;
	}

	public int getItemId() {
		return itemId;
	}

	public int getQuantity() {
		return quantity;
	}

	
	  public Product getProduct() {
		  return product;
		  }
	 
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double totalCost() {
		// TODO Auto-generated method stub
		return quantity * product.calFinalCost();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.getItemId() == ((LineItem) obj).getItemId();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return product+"\nItemId:  "+getItemId()+"\t\t\t\t\tQuantity: "+getQuantity()+"\n\t\t\t\t\t\ttotalprice: "+totalCost();
	}
}
