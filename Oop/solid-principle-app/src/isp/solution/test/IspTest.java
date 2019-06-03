package isp.solution.test;

import isp.solution.IWork;
import isp.solution.IWorkEat;
import isp.solution.Manager;
import isp.solution.Robot;

public class IspTest {
	public static void main(String[] args) {
		Manager m=new Manager();
		Robot r=new Robot();
		
		atWorkStation(m);
		atTheCafeteria(m);
		
		atWorkStation(r);
		
	}

	private static void atTheCafeteria(IWorkEat  w) {
		// TODO Auto-generated method stub
		System.out.println("At The Cafeteria");
		
		w.startEat();
		w.stopEat();
		
	}

	private static void atWorkStation(IWork w) {
		// TODO Auto-generated method stub
		System.out.println("At the Work Station");
		w.startWork();
		w.stopWork();
	}
	
}
