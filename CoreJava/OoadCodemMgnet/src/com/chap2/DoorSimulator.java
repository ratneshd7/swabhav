package com.chap2;

public class DoorSimulator {
public static void main(String[] args) {
	DogDoor door=new DogDoor();
	Remote remote=new Remote(door);
	System.out.println("fido barks to go outside");
	remote.pressButton();
	System.out.println("fido has gone outside");
	//after adding timer comment this//remote.pressButton();
	System.out.println("fido's all done");
	//remote.pressButton();//bcoz this will done by timer automatically
	System.out.println("fido back inside");
	//remote.pressButton();
	
}
}
