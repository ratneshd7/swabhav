package com.chap2;

public class DogDoor {
	private boolean open;

	public DogDoor() {

		this.open = false;
	}

	public void open() {
		System.out.println("the dogDoor opens");
		open = true;
	}

	public void close() {
		System.out.println("the dogDoor closes");
		open = false;
	}

	public boolean isOpen() {
		return open;
	}

}
