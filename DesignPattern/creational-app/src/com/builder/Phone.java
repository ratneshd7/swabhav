package com.builder;

public class Phone {
	private String os;
	private int ram;
	private String processor;
	private int battery;

	public Phone(String os, int ram, String processor, int battery) {
		super();
		this.os = os;
		this.ram = ram;
		this.processor = processor;
		this.battery = battery;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nOS: "+os+"\nRam: "+ram+"\nProcessor: "+processor+"\nBattery: "+battery;
	}
}
