package srp.solution.test;

import srp.solution.InvoicePrinter;
import srp.solution.InvoiceSolution;

public class InvoiceSolutionTest {
	public static void main(String[] args) {
		InvoiceSolution invoice = new InvoiceSolution(1, "Ratnesh", 100d, 0.05f, 0.18f);
		InvoicePrinter invoicePrinter=new InvoicePrinter();
		invoicePrinter.printInvoice(invoice);
		
	}
}
