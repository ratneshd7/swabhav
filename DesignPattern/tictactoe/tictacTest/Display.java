package com.techlabs.tictacTest;

import com.techlabs.tictactoe.Board;

public class Display {

	public String printGrid(Board board) {
		String result = board.getPosition(0) + " | " + board.getPosition(1) + " | " + board.getPosition(2) + "\n"
				+ "---------------------\n" + board.getPosition(3) + " | " + board.getPosition(4) + " | " + board.getPosition(5)
				+ "\n" + "---------------------\n" + board.getPosition(6) + " | " + board.getPosition(7) + " | "
				+ board.getPosition(8) + "\n";

		return result;
	}
}