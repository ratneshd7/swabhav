package com.builder.test;

import com.builder.Phone;
import com.builder.PhoneBuilder;

public class TestPhone {
	public static void main(String[] args) {
		Phone phone = new PhoneBuilder().setBattery(0).setProcessor("SnapDragon").getPhone();
		System.out.println(phone);
		
	}
}
