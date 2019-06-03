package dip.solution.test;

import dip.solution.DBLogger;
import dip.solution.FileLogger;
import dip.solution.TaxCalculator;

public class TestTaxCalculator {
	public static void main(String[] args) {
		TaxCalculator calci = new TaxCalculator(new DBLogger());
		System.out.println(calci.calTax(10, 5));
		
		System.out.println(calci.calTax(10, 0));
		
		TaxCalculator calci1 = new TaxCalculator(new FileLogger());
		System.out.println(calci1.calTax(10, 0));
	}
}
