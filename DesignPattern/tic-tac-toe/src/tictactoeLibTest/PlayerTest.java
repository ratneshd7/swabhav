package tictactoeLibTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import tictactoe.Mark;
import tictactoe.Player;

class PlayerTest {

	@Test

	public void checkPlayerTest() {
		Player player = new Player("Brijesh", Mark.O);
		assertEquals("Brijesh", player.getName());
		assertEquals(Mark.O, player.getMark());

	}
}
