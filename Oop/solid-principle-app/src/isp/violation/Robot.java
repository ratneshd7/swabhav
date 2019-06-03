package isp.violation;

public class Robot implements Iworker {

	@Override
	public void startWork() {
		// TODO Auto-generated method stub
		System.out.println("Robot start work");
	}

	@Override
	public void stopWork() {
		// TODO Auto-generated method stub
		System.out.println("robot stop work");
	}

	@Override
	public void startEat() {
		// TODO Auto-generated method stub
		throw new RuntimeException("Robot cannot eat");
	}

	@Override
	public void stopEat() {
		// TODO Auto-generated method stub
		throw new RuntimeException("Robot cannot eat");
	}

}
