package tictactoeLibTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import tictactoe.Board;
import tictactoe.Cell;
import tictactoe.Mark;



class BoardTest {

	@Test
	public void checkBoardConstructorSetAndGetMethodTest() throws Exception {
		Cell cell = new Cell();
		Board board = new Board();
		board.setPosition(1, Mark.O);

		assertEquals(Mark.O, board.getPosition(1));

	}

	@Test
	public void checkBoardFullMethodTest() throws Exception {
		Board board = new Board();
		for(Cell cell:board.cellValues())
		{
			assertEquals(Mark.EMPTY,cell.getMark());
		}
		board.setPosition(1, Mark.O);

		assertEquals(false, board.isBoardAllEmpty());
		board.setPosition(2, Mark.O);
		board.setPosition(3, Mark.X);
		board.setPosition(4, Mark.O);
		board.setPosition(6, Mark.O);
		board.setPosition(7, Mark.X);
		board.setPosition(8, Mark.O);
		board.setPosition(0, Mark.O);
		board.setPosition(5, Mark.X);
		assertEquals(true, board.isBoardAlreadyFull());

	}

	@Test
	public void checkBoardEmptyMethodTest() throws Exception {
		Board board = new Board();

		assertEquals(true, board.isBoardAllEmpty());
		board.setPosition(5, Mark.X);
		assertEquals(false, board.isBoardAllEmpty());

	}

}
