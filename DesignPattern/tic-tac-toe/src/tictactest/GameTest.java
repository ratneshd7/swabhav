package tictactest;

import java.util.Scanner;

import tictactoe.Board;
import tictactoe.Game;
import tictactoe.Mark;
import tictactoe.Player;
import tictactoe.ResultAnalyzer;



public class GameTest {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		String player1, player2;
		Board board = new Board();
		ResultAnalyzer result = new ResultAnalyzer(board);
		Player player[] = new Player[2];
		Mark mark = null;
		System.out.println("Welcome to the Game!\nEnter 1st player Name");

		player1 = sca.nextLine();
		System.out.println("Enter 2nd player Name");
		player2 = sca.nextLine();
		player[0] = new Player(player1, mark.X);
		player[1] = new Player(player2, mark.O);
		Game game = new Game(result, board, player);
		PlayGame playgame = new PlayGame();

		playgame.print(game, board, player);

	}

}
