package com.techlabs.dogdoors;

import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {
	private boolean open;

	public void open() {
		// TODO Auto-generated method stub
		System.out.println("the dog door open");
		open = true;
		final Timer timer = new Timer();
		timer.schedule(new TimerTask() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				close();
				timer.cancel();
			}

		}, 5000);
	}

	public void close() {
		// TODO Auto-generated method stub
		System.out.println("the dog door close");
		open = false;
	}

	public boolean isOpen() {
		// TODO Auto-generated method stub
		return false;
	}
}
