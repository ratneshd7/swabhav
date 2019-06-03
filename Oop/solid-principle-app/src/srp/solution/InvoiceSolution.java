package srp.solution;

public class InvoiceSolution {
	private int no;
	private String name;
	private double cost;
	private float discount;
	private float gst;

	public InvoiceSolution(int no, String name, double cost, float discount, float gst) {
		super();
		this.no = no;
		this.name = name;
		this.cost = cost;
		this.discount = discount;
		this.gst = gst;
	}
	
	
	
	public int getNo() {
		return no;
	}



	public String getName() {
		return name;
	}



	public double getCost() {
		return cost;
	}



	public float getDiscount() {
		return discount;
	}



	public float getGst() {
		return gst;
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
	
}
