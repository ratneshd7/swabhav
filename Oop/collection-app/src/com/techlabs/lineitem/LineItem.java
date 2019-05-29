package com.techlabs.lineitem;

public class LineItem implements Comparable<LineItem> {
	private String product;
	private int price;
	private int quantity;

	public LineItem(String prod, int price, int qty) {
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

	public double calTotalPrice() {
		return price * quantity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + price;
		result = prime * result + ((product == null) ? 0 : product.hashCode());
		result = prime * result + quantity;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LineItem other = (LineItem) obj;
		if (price != other.price)
			return false;
		if (product == null) {
			if (other.product != null)
				return false;
		} else if (!product.equals(other.product))
			return false;
		if (quantity != other.quantity)
			return false;
		return true;
	}

	@Override
	public int compareTo(LineItem item) {
		// TODO Auto-generated method stub
		if(product.equals(item.product))
		return 0;
		else 
			return 1;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nProduct:"+getProduct()+"\n price:"+getPrice()+"\nTotalPrice:"+calTotalPrice()+"\nQuantity:"+getQuantity();
	}
}
