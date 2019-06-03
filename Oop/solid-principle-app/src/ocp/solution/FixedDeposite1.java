package ocp.solution;

public class FixedDeposite1 {
	private String name;
	private double prncipal;
	private int duration;
	private Festival Ifestival;
	

	public FixedDeposite1(String name, double prncipal, int duration,Festival inter) {
		super();
		this.name = name;
		this.prncipal = prncipal;
		this.duration = duration;
		this.Ifestival=inter;
		
	}

	public String getName() {
		return name;
	}

	public double getPrncipal() {
		return prncipal;
	}

	public int getDuration() {
		return duration;
	}

	public double calSimpleinterest() {
		return prncipal * Ifestival.calRate() * duration;
	}
}
