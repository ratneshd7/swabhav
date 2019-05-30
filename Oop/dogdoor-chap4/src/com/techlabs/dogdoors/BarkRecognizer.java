package com.techlabs.dogdoors;

public class BarkRecognizer {
	private DogDoor door;

	public BarkRecognizer(DogDoor door) {
		// TODO Auto-generated constructor stub
		this.door = door;
	}

	public void recognize(String bark) {
		// TODO Auto-generated method stub
		System.out.println("the bark recognize " + bark);
		if (door.getAllowedBark().equals(bark))
			door.open();
		else
			System.out.println("this dog is not allowed");
	}

}
