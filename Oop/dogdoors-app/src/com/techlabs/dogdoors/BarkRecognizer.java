package com.techlabs.dogdoors;

public class BarkRecognizer {
private DogDoor door;

	public BarkRecognizer(DogDoor door) {
		// TODO Auto-generated constructor stub
		this.door=door;
	}

	public void recognize(String bark) {
		// TODO Auto-generated method stub
		System.out.println("Bark recognige"+bark);
		door.open();
	}

}
