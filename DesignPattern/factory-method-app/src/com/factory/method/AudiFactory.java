package com.factory.method;

public class AudiFactory implements IAutomobileFactory {

	private static IAutomobile automobile;

	private AudiFactory() {
	}

	@Override
	public IAutomobile make() {
		// TODO Auto-generated method stub

		if (automobile == null)
			return new Audi();
		return automobile;
	}

	public static IAutomobileFactory getInstatnce() {
		return new AudiFactory();

	}

}
