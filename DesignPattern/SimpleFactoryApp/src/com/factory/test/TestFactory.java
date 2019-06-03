package com.factory.test;

import com.factory.AutoFactory;
import com.factory.AutoType;
import com.factory.IAutomobile;

public class TestFactory {
	public static void main(String[] args) {
		AutoFactory factory = new AutoFactory();
		IAutomobile auto = factory.make(AutoType.BMW);
		auto.star();
		auto.stop();
		System.out.println(auto.getClass().getSimpleName());
		
		
	}
}
