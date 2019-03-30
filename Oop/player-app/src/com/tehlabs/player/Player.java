package com.tehlabs.player;

public class Player {
	String name;
	int age;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Player(String name, int age) {

		this.name = name;
		this.age = age;
	}

	public Player(String name) {

		this(name, 18);
	}

	public Player whoIsElder(Player player) {
		// TODO Auto-generated method stub
		if (player.getAge() >= this.age)
			return player;
		else
			return this;

	}

}
