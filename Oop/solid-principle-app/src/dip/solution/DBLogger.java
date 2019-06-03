package dip.solution;

public class DBLogger implements Logger {
	public void log(String ErrorMsg) {
		System.out.println("Log Saved in BD Are" + ErrorMsg);
	}
}
