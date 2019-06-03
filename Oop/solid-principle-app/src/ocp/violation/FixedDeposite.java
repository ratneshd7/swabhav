package ocp.violation;

public class FixedDeposite {
	private String name;
	private double prncipal;
	private int duration;
	private FestivaleType festival;
	private float rate;

	public FixedDeposite(String name, double prncipal, int duration, FestivaleType festival) {
		super();
		this.name = name;
		this.prncipal = prncipal;
		this.duration = duration;
		this.festival = festival;

		if (festival == FestivaleType.NORMAL)
			this.rate = 0.07f;
		else if (festival == FestivaleType.HOLI) {
			this.rate = 0.08f;
		} else
			this.rate = 0.09f;
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

	public FestivaleType getFestival() {
		return festival;
	}

	public float getRate() {
		return rate;
	}

	public double calSimpleinterest() {
		return prncipal * rate * duration;
	}
}
