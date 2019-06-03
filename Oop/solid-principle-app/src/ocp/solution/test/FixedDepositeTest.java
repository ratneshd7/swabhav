package ocp.solution.test;

import ocp.solution.FixedDeposite1;
import ocp.solution.Holi;
import ocp.solution.PrintConsole;

public class FixedDepositeTest {
	public static void main(String[] args) {
		FixedDeposite1 fixedDeposite1 = new FixedDeposite1("Ratnesh",100000,10,new Holi());
		PrintConsole print=new PrintConsole();
		print.printFixedDepositeDetails1(fixedDeposite1);
	}
}
