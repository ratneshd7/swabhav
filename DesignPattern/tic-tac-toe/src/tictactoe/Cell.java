package tictactoe;

public class Cell {
	private Mark mark;

	public Cell() {
		this.mark = Mark.EMPTY;
	}

	public void setMark(Mark mark) {
		this.mark = mark;
	}

	public Mark getMark() {
		return mark;
	}

	public boolean isAlreadyMarked() {
		if (!(mark == Mark.EMPTY))
			return true;
		return false;
	}

}
