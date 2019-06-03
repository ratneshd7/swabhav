package com.factory;

public class AutoFactory {
	private static AutoFactory factory;
	private AutoFactory(){
		
	}
	public static AutoFactory getInstance() {
		if(factory==null)
			factory= new AutoFactory();
		return factory;

	}
	public IAutomobile make(AutoType type) {
		if (type == AutoType.BMW)
			return new Bmw();
		else if (type == AutoType.AUDI)
			return new Audi();
		else
			return new Tesla();

	}
}
