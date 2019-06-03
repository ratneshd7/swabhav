package ocp.violation;

public class PrintConsole {
	public void printFixedDepositeDetails(FixedDeposite fdeposite) {
		System.out.println("\nAccount Holder Name: "+fdeposite.getName()+"\nPrincipal: "+fdeposite.getPrncipal()+"\nDuration: "+fdeposite.getDuration()+"\nFestival :"+fdeposite.getFestival()+"\tRate"+fdeposite.getRate()+"\nSimpleInterest :"+fdeposite.calSimpleinterest());


	}
}
