package com.techlabs.tictactoeLibTest;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.tictactoe.Board;
import com.techlabs.tictactoe.Cell;
import com.techlabs.tictactoe.Mark;
import com.techlabs.tictactoe.Player;
import com.techlabs.tictactoe.Result;
import com.techlabs.tictactoe.ResultAnalyzer;

class PlayerTest {

	@Test

	public void checkPlayerTest() {
		Player player = new Player("Brijesh", Mark.O);
		assertEquals("Brijesh", player.getName());
		assertEquals(Mark.O, player.getMark());

	}
}
