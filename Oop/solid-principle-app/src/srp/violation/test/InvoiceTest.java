package srp.violation.test;

import srp.voilation.Invoice;

public class InvoiceTest {
	public static void main(String[] args) {
		Invoice invoice = new Invoice(1, "Ratnesh", 100d, 0.05f, 0.18f);
		invoice.printInvoice();
	}
}
