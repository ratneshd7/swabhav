package com.factory.test;

import com.factory.AutoFactory;
import com.factory.AutoType;
import com.factory.IAutomobile;

public class TestFactory {
	public static void main(String[] args) {
		AutoFactory factory = AutoFactory.getInstance();
		IAutomobile auto = factory.make(AutoType.BMW);
		auto.star();
		auto.stop();
		System.out.println(auto.getClass().getSimpleName());
		
		IAutomobile auto1=factory.make(AutoType.AUDI);
		auto1.star();
		auto1.stop();
		System.out.println(auto1.getClass().getSimpleName());
	}
}
