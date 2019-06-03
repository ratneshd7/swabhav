package isp.violation.test;

import isp.violation.Iworker;
import isp.violation.Manager;
import isp.violation.Robot;

public class IspTest {
	public static void main(String[] args) {
		Manager m=new Manager();
		Robot r=new Robot();
		
		atWorkStation(m);
		atTheCafeteria(m);
		
		atWorkStation(r);
		atTheCafeteria(r);// liskov Substitution violation
		
	}

	private static void atTheCafeteria(Iworker  w) {
		// TODO Auto-generated method stub
		System.out.println("At The Cafeteria");
		
		w.startEat();
		w.stopEat();
		
	}

	private static void atWorkStation(Iworker w) {
		// TODO Auto-generated method stub
		System.out.println("At the Work Station");
		w.startWork();
		w.stopWork();
	}
	
}
