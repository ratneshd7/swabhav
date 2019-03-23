package com.chap1;

class Guitar {
	private String serialNo, model;
	Builder builder;
	Type type;
	Wood backWood, topWood;
	private double price;

	public Guitar(String serialNo, Builder fender, String model, Type electric, Wood mapple, Wood mapple2,
			double price) {
		super();
		this.serialNo = serialNo;
		this.builder = fender;
		this.model = model;
		this.type = electric;
		this.backWood = mapple;
		this.topWood = mapple2;
		this.price = price;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public Builder getBuilder() {
		return builder;
	}

	public String getModel() {
		return model;
	}

	public Type getType() {
		return type;
	}

	public Wood getBackWood() {
		return backWood;
	}

	public Wood getTopWood() {
		return topWood;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
