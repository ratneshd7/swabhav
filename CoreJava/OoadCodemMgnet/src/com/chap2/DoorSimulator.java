package com.chap2;

public class DoorSimulator {
	public static void main(String[] args) {
		DogDoor door = new DogDoor();
		Remote remote = new Remote(door);
		// System.out.println("fido barks to go outside");
		System.out.println();
		remote.pressButton();
		System.out.println("fido has gone outside");
		// after adding timer comment this//remote.pressButton();
		System.out.println("fido's all done");
		// remote.pressButton();//bcoz this will done by timer automatically

		try {
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e) {

		}

		System.out.println("...but fido stuck outside");
		System.out.println("fido start barking");
		System.out.println("so gina grab the remote control");

		remote.pressButton();
		System.out.println("fido back inside");
		// remote.pressButton();

	}
}
