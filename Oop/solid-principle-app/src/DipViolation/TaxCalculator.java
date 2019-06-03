package DipViolation;

public class TaxCalculator {
	private LogType log;

	public TaxCalculator(LogType log) {

		this.log = log;
	}

	public int calTax(int amount, int rate) {
		try {
			int tax = amount / rate;
			return tax;
		} catch (Exception e) {
			if (log.equals(LogType.DB)) {
				DBLogger logger = new DBLogger();
				logger.log(e.getMessage().toString());
			}
			if (log.equals(LogType.FILE)) {
				FileLogger filelogger = new FileLogger();
				filelogger.log(e.getMessage().toString());
			}
		}
		return 0;
	}
}
