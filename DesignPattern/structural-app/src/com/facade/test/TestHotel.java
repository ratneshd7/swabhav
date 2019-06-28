package com.facade.test;

import com.facade.HotelKeeper;

public class TestHotel {
	public static void main(String[] args) {
		HotelKeeper keeper=new HotelKeeper();
		keeper.getVegMenu();
		keeper.getNonVegMenu();
	}
}
