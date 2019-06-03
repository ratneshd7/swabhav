package dip.solution;

public class FileLogger implements Logger {
	public void log(String ErrorMsg) {
		System.out.println("Log saved in File"+ErrorMsg);
	}
}
