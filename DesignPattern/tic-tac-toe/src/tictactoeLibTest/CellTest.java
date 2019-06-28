package tictactoeLibTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import tictactoe.Cell;
import tictactoe.Mark;

class CellTest {
	

	@Test
	public void checkConstructorSetAndGetMethodTest() {
		Cell cell = new Cell();
		assertEquals(Mark.EMPTY, cell.getMark());
		cell.setMark(Mark.X);
		assertEquals(Mark.X, cell.getMark());
		cell.setMark(Mark.O);
		assertEquals(Mark.O, cell.getMark());
	}

	@Test
	public void checkAlradyMarkedMethod() {
		Cell cell = new Cell();
		assertEquals(false, cell.isAlreadyMarked());
		cell.setMark(Mark.O);
		assertEquals(true, cell.isAlreadyMarked());

	}

}
