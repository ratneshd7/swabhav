package com.techlabs.tictacTest;

import java.util.Scanner;

import com.techlabs.tictactoe.Board;
import com.techlabs.tictactoe.Game;
import com.techlabs.tictactoe.Player;
import com.techlabs.tictactoe.Result;

public class PlayGame {
	public void print(Game game, Board board, Player player[]) {
		int a = 0;
		Scanner sc = new Scanner(System.in);
		Display display = new Display();
		System.out.println("Lets Begin....Tic Tac Toe");
		while (!board.isBoardAlreadyFull()) {
			if (game.getSwitchPlayer() == 0) {
				a = game.getSwitchPlayer();
				a++;
			}
			if (game.getSwitchPlayer() == 1) {
				a = game.getSwitchPlayer();
				a--;

			}
			if ((game.getStatus() == Result.WIN)) {
				System.out.println("Game finished!!! " + player[(a)].getName() + " Congrats " + " You Won!!!");
				System.exit(0);
			}

			System.out.print("Hello " + player[(game.getSwitchPlayer())].getName() + ": enter your cell number : ");
			int cellNumber = sc.nextInt();

			if (cellNumber >= 0 & cellNumber <= 8) {
				try {
					game.play(cellNumber);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				System.out.println(display.printGrid(game.getBoard()));
			}

			else {
				System.out.println("Invalid cell number!");
			}
		}
		if (game.getStatus() == Result.DRAW) {
			System.out.println("$$$$---Game Drawn---$$$$");
		}

	}

}
