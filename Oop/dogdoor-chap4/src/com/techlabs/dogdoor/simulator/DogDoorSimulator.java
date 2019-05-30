package com.techlabs.dogdoor.simulator;

import com.techlabs.dogdoors.BarkRecognizer;
import com.techlabs.dogdoors.DogDoor;
import com.techlabs.dogdoors.Remote;

public class DogDoorSimulator {

	public static void main(String[] args) {
		DogDoor door = new DogDoor();

		BarkRecognizer brecog = new BarkRecognizer(door);
		Remote remote = new Remote(door);

		System.out.println("fido start barking");
		
		door.setAllowedBark("woof");
		brecog.recognize("woof");
		

		System.out.println("Fido gone outside");
		System.out.println("fido all done");

		try {
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e) {

		}
		System.out.println("but he stuck outside");

		System.out.println("fido start barking");
		brecog.recognize("woof");

		System.out.println("fido back inside");
	}
}
