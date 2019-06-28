package com.facade;

public class HotelKeeper {

	private Hotel veg;
	private Hotel nonveg;

	public HotelKeeper() {
		super();
		veg = new Veg();
		nonveg = new NonVeg();
	}

	public void getVegMenu() {
		veg.getMenus();
	}

	public void getNonVegMenu() {
		nonveg.getMenus();
	}
}
