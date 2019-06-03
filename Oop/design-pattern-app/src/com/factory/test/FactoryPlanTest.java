package com.factory.test;

import com.techlabs.factory.GetPlan;
import com.techlabs.factory.Plan;

public class FactoryPlanTest {
	public static void main(String[] args) {
		GetPlan get = new GetPlan();
		Plan plan = get.getPlan("RURAL");
		System.out.println(plan.getRate());
	}
}
