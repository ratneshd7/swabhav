package tictactoe;

import java.util.Scanner;

public class Game {

	private ResultAnalyzer result;
	private Board board;
	private Player player[];
	private Result status;
	private int switchPlayer;

	public Game(ResultAnalyzer result, Board board, Player player[]) {
		this.result = result;
		this.board = board;
		this.player = player;
		switchPlayer = 0;

	}

	public ResultAnalyzer getResult() {
		return result;
	}

	public Board getBoard() {
		return board;
	}

	public Player[] getplayer() {
		return player;
	}

	public Result getStatus() {
		return status;

	}
	public int getSwitchPlayer()
	{
		return switchPlayer;
	}

	public void play(int position) throws Exception {
		if (switchPlayer == 0) {
			board.setPosition(position, player[switchPlayer].getMark());
			status = result.resultAnalyzer(player[switchPlayer].getMark());
			switchPlayer = 1;
			return;

		}

		board.setPosition(position, player[switchPlayer].getMark());
		status = result.resultAnalyzer(player[switchPlayer].getMark());
		switchPlayer = 0;

	}
	/*public void display(Board board,Game game,Result res) throws Exception {
		Scanner sc = new Scanner(System.in);
		while (!board.isBoardAlreadyFull()) {
			System.out.println("Enter position");
			int position = sc.nextInt();

			game.play(position);
			System.out.println(" " + board.getPosition(position));
			System.out.println(game.getStatus());
			if (game.getStatus() == res.WIN)
				break;

		}
	}*/
}
