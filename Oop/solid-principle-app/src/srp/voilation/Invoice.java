package srp.voilation;

public class Invoice {
	private int no;
	private String name;
	private double cost;
	private float discount;
	private float gst;

	public Invoice(int no, String name, double cost, float discount, float gst) {
		super();
		this.no = no;
		this.name = name;
		this.cost = cost;
		this.discount = discount;
		this.gst = gst;
	}
	
	public float calDiscount(){
		return (float)(cost*discount);
	}
	public float calGst(){
		return (float)(cost*gst);
	}
	public float calTotalCost(){
		return (float)(cost+calGst()-calDiscount());
	}
	public void printInvoice() {
		System.out.println("Invoice No: "+no+"\nInvoice Name: "+name+"\nCost: "+cost+"\nDiscount: "+discount*100+"%"+"\t"+calDiscount()+"\nGst: "+gst*100+"%"+"\t"+calGst()+"\nTotal Cost: "+calTotalCost());

	}
}
