package com.techlabs.tictactoe;

public class ResultAnalyzer {
	private Board board;

	public ResultAnalyzer(Board board) {
		this.board = board;
	}

	public Result resultAnalyzer(Mark mark) {
		if (board.getPosition(0) == mark && board.getPosition(1) == mark && board.getPosition(2) == mark)
			return Result.WIN;
		if (board.getPosition(3) == mark && board.getPosition(4) == mark && board.getPosition(5) == mark)
			return Result.WIN;
		if (board.getPosition(6) == mark && board.getPosition(7) == mark && board.getPosition(8) == mark)
			return Result.WIN;
		if (board.getPosition(0) == mark && board.getPosition(3) == mark && board.getPosition(6) == mark)
			return Result.WIN;
		if (board.getPosition(1) == mark && board.getPosition(4) == mark && board.getPosition(7) == mark)
			return Result.WIN;
		if (board.getPosition(2) == mark && board.getPosition(5) == mark && board.getPosition(8) == mark)
			return Result.WIN;
		if (board.getPosition(0) == mark && board.getPosition(4) == mark && board.getPosition(8) == mark)
			return Result.WIN;
		if (board.getPosition(2) == mark && board.getPosition(4) == mark && board.getPosition(6) == mark)
			return Result.WIN;
		if (board.isBoardAlreadyFull())
			return Result.DRAW;
		return Result.PROGRESS;

	}

}
