package dip.solution;

public class TaxCalculator {
	private Logger log;

	public TaxCalculator(Logger log) {

		this.log = log;
	}

	public int calTax(int amount, int rate) {
		try {
			int tax = amount / rate;
			return tax;
		} catch (Exception e) {
			log.log(e.getMessage().toString());
		}
		return 0;
	}
}
