package com.techlabs.dogdoors;

public class Remote {
	private DogDoor door;

	public Remote(DogDoor door2) {
		// TODO Auto-generated constructor stub
		this.door=door2;
	}

	public void pressButton() {
		// TODO Auto-generated method stub
		System.out.println("pressing the remote button");
		if (door.isOpen()) {
			door.close();
		} else
			door.open();
	}
}
