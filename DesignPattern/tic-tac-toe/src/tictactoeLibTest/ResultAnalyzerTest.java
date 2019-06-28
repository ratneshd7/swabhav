package tictactoeLibTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import tictactoe.Board;
import tictactoe.Cell;
import tictactoe.Mark;
import tictactoe.Result;
import tictactoe.ResultAnalyzer;

class ResultAnalyzerTest {

	@Test
	public void checkResultAnalyzerHorizontalTest() throws Exception {
		Cell cell = new Cell();
		Board board = new Board();
		ResultAnalyzer result = new ResultAnalyzer(board);
		board.setPosition(0, Mark.O);
		board.setPosition(1, Mark.O);
		board.setPosition(2, Mark.O);
		assertEquals(Result.WIN, result.resultAnalyzer(Mark.O));

	}
	@Test
	public void checkResultAnalyzerDiagonal1Test() throws Exception {
		Cell cell = new Cell();
		Board board = new Board();
		ResultAnalyzer result = new ResultAnalyzer(board);
		board.setPosition(0, Mark.O);
		board.setPosition(4, Mark.O);
		board.setPosition(8, Mark.O);
		assertEquals(Result.WIN, result.resultAnalyzer(Mark.O));

	}
	@Test
	public void checkResultAnalyzerDiagonal2Test() throws Exception {
		Cell cell = new Cell();
		Board board = new Board();
		ResultAnalyzer result = new ResultAnalyzer(board);
		board.setPosition(2, Mark.X);
		board.setPosition(4, Mark.X);
		board.setPosition(6, Mark.X);
		assertEquals(Result.WIN, result.resultAnalyzer(Mark.X));

	}
	@Test
	public void checkResultAnalyzerVertical1Test() throws Exception {
		Cell cell = new Cell();
		Board board = new Board();
		ResultAnalyzer result = new ResultAnalyzer(board);
		board.setPosition(1, Mark.O);
		board.setPosition(4, Mark.O);
		board.setPosition(7, Mark.O);
		assertEquals(Result.WIN, result.resultAnalyzer(Mark.O));

	}
	@Test
	public void checkResultAnalyzerHorizontal2Test() throws Exception {
		Cell cell = new Cell();
		Board board = new Board();
		ResultAnalyzer result = new ResultAnalyzer(board);
		board.setPosition(6, Mark.X);
		board.setPosition(7, Mark.X);
		board.setPosition(8, Mark.X);
		assertEquals(Result.WIN, result.resultAnalyzer(Mark.X));

	}
	@Test
	public void checkResultAnalyzerVertical2Test() throws Exception {
		Cell cell = new Cell();
		Board board = new Board();
		ResultAnalyzer result = new ResultAnalyzer(board);
		board.setPosition(2, Mark.X);
		board.setPosition(5, Mark.X);
		board.setPosition(8, Mark.X);
		assertEquals(Result.WIN, result.resultAnalyzer(Mark.X));

	}

	@Test
	public void checkResultAnalyzerDrawTest() throws Exception {
		Cell cell = new Cell();
		Board board = new Board();
		ResultAnalyzer result = new ResultAnalyzer(board);
		board.setPosition(0, Mark.O);
		board.setPosition(1, Mark.X);
		board.setPosition(2, Mark.O);
		board.setPosition(3, Mark.X);
		board.setPosition(4, Mark.O);
		board.setPosition(5, Mark.X);
		board.setPosition(6, Mark.X);
		board.setPosition(7, Mark.O);
		board.setPosition(8, Mark.X);
		assertEquals(Result.DRAW, result.resultAnalyzer(Mark.O));

	}

	@Test
	public void checkResultAnalyzerProgressTest() throws Exception {
		Cell cell = new Cell();
		Board board = new Board();
		ResultAnalyzer result = new ResultAnalyzer(board);
		board.setPosition(0, Mark.O);
		board.setPosition(1, Mark.X);
		board.setPosition(2, Mark.O);
		board.setPosition(3, Mark.X);
		board.setPosition(4, Mark.O);
		board.setPosition(5, Mark.X);
		assertEquals(Result.PROGRESS, result.resultAnalyzer(Mark.X));

	}

}
