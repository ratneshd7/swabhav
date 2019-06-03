package isp.violation;

public class Manager implements Iworker {

	@Override
	public void startWork() {
		// TODO Auto-generated method stub
		System.out.println("Manager Start work");
	}

	@Override
	public void stopWork() {
		// TODO Auto-generated method stub
		System.out.println("Manager Stop Work");
	}

	@Override
	public void startEat() {
		// TODO Auto-generated method stub
		System.out.println("Manager Start Eat");
	}

	@Override
	public void stopEat() {
		// TODO Auto-generated method stub
		System.out.println("Manager Stop Eat");
	}

}
