package srp.solution;

public class InvoicePrinter {
	public void printInvoice(InvoiceSolution invoice) {
		System.out.println("Invoice No: "+invoice.getNo()+"\nInvoice Name: "+invoice.getName()+"\nCost: "+invoice.getCost()+"\nDiscount: "+invoice.getDiscount()*100+"%"+"\t"+invoice.calDiscount()+"\nGst: "+invoice.getGst()*100+"%"+"\t"+invoice.calGst()+"\nTotal Cost: "+invoice.calTotalCost());

	}

}
