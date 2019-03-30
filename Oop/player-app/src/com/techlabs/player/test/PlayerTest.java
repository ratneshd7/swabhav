package com.techlabs.player.test;

import com.tehlabs.player.Player;

public class PlayerTest {
	public static void main(String[] args) {
		Player p1 = new Player("sachin", 50);
		printDetails(p1);
		Player p2 = new Player("virat");
		printDetails(p2);

		Player elder = p1.whoIsElder(p2);
		System.out.println("Elder player is=" + elder.getName());
	}

	private static void printDetails(Player player) {
		// TODO Auto-generated method stub
		System.out.println("Name=" + player.getName() + " " + "Age=" + player.getAge());
	}
}
