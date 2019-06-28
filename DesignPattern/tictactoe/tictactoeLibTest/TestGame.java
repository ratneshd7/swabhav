package com.techlabs.tictactoeLibTest;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.tictactoe.Board;
import com.techlabs.tictactoe.Cell;
import com.techlabs.tictactoe.Game;
import com.techlabs.tictactoe.Mark;
import com.techlabs.tictactoe.Player;
import com.techlabs.tictactoe.Result;
import com.techlabs.tictactoe.ResultAnalyzer;

class TestGame {

	@Test

	public void checkGameWinTest() throws Exception {
		Cell cell = new Cell();
		Board board = new Board();
		ResultAnalyzer result = new ResultAnalyzer(board);
		Player player[] = new Player[2];
		player[0] = new Player("Brijesh", Mark.O);
		player[1] = new Player("Jaiswal", Mark.X);
		Game game = new Game(result, board, player);
		game.play(0);
		game.play(3);
		game.play(1);
		game.play(4);
		game.play(2);
		game.play(5);
		game.play(6);
		game.play(8);
		game.play(7);
		Result status = game.getStatus();

		assertEquals(Result.WIN, status);

	}

	@Test

	public void checkGameDrawTest() throws Exception {
		Cell cell = new Cell();
		Board board = new Board();
		ResultAnalyzer result = new ResultAnalyzer(board);
		Player player[] = new Player[2];
		player[0] = new Player("Brijesh", Mark.O);
		player[1] = new Player("Jaiswal", Mark.X);
		Game game = new Game(result, board, player);
		game.play(0);
		game.play(3);
		game.play(1);
		game.play(4);
		game.play(5);
		game.play(2);
		game.play(6);
		game.play(7);
		game.play(8);
		Result status = game.getStatus();

		assertEquals(Result.DRAW, status);

	}

	@Test
	public void checkGameProgressTest() throws Exception {
		Cell cell = new Cell();
		Board board = new Board();
		ResultAnalyzer result = new ResultAnalyzer(board);
		Player player[] = new Player[2];
		player[0] = new Player("Brijesh", Mark.O);
		player[1] = new Player("Jaiswal", Mark.X);
		Game game = new Game(result, board, player);
		game.play(0);
		game.play(3);
		game.play(1);
		game.play(4);
		game.play(5);
		Result status = game.getStatus();

		assertEquals(Result.PROGRESS, status);

	}

}
