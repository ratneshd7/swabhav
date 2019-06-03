package ocp.violation.test;

import ocp.violation.FestivaleType;
import ocp.violation.FixedDeposite;
import ocp.violation.PrintConsole;

public class FixedDepositeTest {
	public static void main(String[] args) {
		FixedDeposite fixedDeposite = new FixedDeposite("Ratnesh", 100000d, 5, FestivaleType.NORMAL);
		PrintConsole print=new PrintConsole();
		print.printFixedDepositeDetails(fixedDeposite);
	}
}
