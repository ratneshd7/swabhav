package dip.violation.test;

import DipViolation.LogType;
import DipViolation.TaxCalculator;

public class TestTaxCalculator {
	public static void main(String[] args) {
		TaxCalculator calci = new TaxCalculator(LogType.DB);
		System.out.println(calci.calTax(10, 5));
		
		System.out.println(calci.calTax(10, 0));
		
		TaxCalculator calci1 = new TaxCalculator(LogType.DB);
		System.out.println(calci1.calTax(10, 0));
	}
}
