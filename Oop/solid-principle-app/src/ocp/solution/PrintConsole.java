package ocp.solution;

public class PrintConsole {
	public void printFixedDepositeDetails1(FixedDeposite1 fdeposite) {
		System.out.println("\nAccount Holder Name: "+fdeposite.getName()+"\nPrincipal: "+fdeposite.getPrncipal()+"\nDuration: "+fdeposite.getDuration()+"\nSimpleInterest :"+fdeposite.calSimpleinterest());


	}
}
