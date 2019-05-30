package com.techlabs.dogdoor.simulator;

import com.techlabs.dogdoors.Bark;
import com.techlabs.dogdoors.BarkRecognizer;
import com.techlabs.dogdoors.DogDoor;
import com.techlabs.dogdoors.Remote;

public class DogDoorSimulator {

	public static void main(String[] args) {
		DogDoor door = new DogDoor();

		door.addAllowedbark(new Bark("rowlf"));
		door.addAllowedbark(new Bark("woof"));
		door.addAllowedbark(new Bark("yip"));
		
		BarkRecognizer brecog = new BarkRecognizer(door);
		Remote remote = new Remote(door);

		System.out.println("fido start barking");
		
		//door.setAllowedBark("woof");
		brecog.recognize(new Bark("woof"));
		

		System.out.println("Fido gone outside");
		System.out.println("fido all done");

		try {
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e) {

		}
		System.out.println("but he stuck outside");

		Bark amallBark=new Bark("yip");
		System.out.println("a small dog started barking");
		brecog.recognize(amallBark);
		
		try {
			Thread.currentThread().sleep(5000);
		} catch (InterruptedException e) {

		}
		
		System.out.println("fido start barking");
		brecog.recognize(new Bark("rowlf"));

		System.out.println("fido back inside");
	}
}
