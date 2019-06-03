package com.factory;

public class AutoFactory {
	public IAutomobile make(AutoType type) {
		if (type == AutoType.BMW)
			return new Bmw();
		else if (type == AutoType.AUDI)
			return new Audi();
		else
			return new Tesla();

	}
}
