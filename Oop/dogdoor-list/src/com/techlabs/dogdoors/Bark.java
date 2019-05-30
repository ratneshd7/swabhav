package com.techlabs.dogdoors;

public class Bark {
	private String sound;

	public Bark(String sound) {
		// TODO Auto-generated constructor stub
		this.sound = sound;
	}

	public String getSound() {
		return sound;
	}

	public boolean equals(Object bark) {
		// TODO Auto-generated method stub
		if (bark instanceof Bark) {
			Bark otherbark = (Bark) bark;
			if (this.sound.equals(otherbark.sound)) {
				return true;

			}
		}

		return false;
	}
}
