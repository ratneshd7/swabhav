package com.techlabs.customerorder;

public class Product {
	private int id;
	private String name;
	private double cost;
	private float discount;

	public Product(int id, String name, double cost, float discount) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		this.cost=cost;
		this.discount=discount;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCost() {
		return cost;
	}

	public float getDiscount() {
		return discount;
	}

	public double calFinalCost() {
		// TODO Auto-generated method stub
		return cost-discount*cost;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nProductname: "+getName()+"\t\t\t\tProductcost: "+getCost()+"\n\t\t\t\t\t\tDiscoumt Price: "+calFinalCost();
	}
}
