package com.techlabs.factory;

public class GetPlan {
	public Plan getPlan(String planType) {
		if (planType.equalsIgnoreCase("DOMESTIC")) {
			return new Domestic();
		} else if (planType.equalsIgnoreCase("RURAL")) {
			return new Rural();
		}
		else
			return null;
	}
}
