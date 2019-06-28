package tictactoe;

public class Board {
	private Cell cell[] = new Cell[9];

	public Board() {
		for (int i = 0; i < 9; i++) {
			cell[i] = new Cell();
		}
	}
	public Cell[] cellValues()
	{
		return cell;
	}

	public void setPosition(int position, Mark mark) throws Exception {

		if (cell[position].isAlreadyMarked()) {
			throw new Exception("ALready marked this cell"+position);
			//System.out.println("Already marked this cell" + position);
		} else

			cell[position].setMark(mark);
	}

	public Mark getPosition(int position) {
		return cell[position].getMark();
	}

	public boolean isBoardAlreadyFull() {
		for (int index = 0; index < 9; index++) {
			if (!cell[index].isAlreadyMarked())
				return false;

		}
		return true;
	}

	public boolean isBoardAllEmpty() {
		for (int index = 0; index < 9; index++) {
			if (cell[index].isAlreadyMarked())
				return false;

		}
		return true;
	}
}
