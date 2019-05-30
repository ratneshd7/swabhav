package com.techlabs.dogdoors;

import java.util.Iterator;
import java.util.List;

public class BarkRecognizer {
	private DogDoor door;

	public BarkRecognizer(DogDoor door) {
		// TODO Auto-generated constructor stub
		this.door = door;
	}

	public void recognize(Bark bark) {
		// TODO Auto-generated method stub
		List allowedbark = door.getAllowedBark();
		System.out.println("the bark recognize " + bark);
		for (Iterator i = allowedbark.iterator(); i.hasNext();) {
			Bark allowedBark = (Bark) i.next();
			if (allowedBark.equals(bark)) {
				door.open();
				return;

			}
		}
		System.out.println("this dog is not allowed");
	}
}