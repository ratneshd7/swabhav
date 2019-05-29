package com.techlabs.orderitem;

import java.util.LinkedHashMap;

public class TestLinkedHashMap {
	public static void main(String args[]) {

		LinkedHashMap<Integer, String> lhm=new LinkedHashMap<Integer, String>();

		lhm.put(100, "Amit");

		lhm.put(null, "Ajay");
		lhm.put(101, "Vijay");
		lhm.put(102, "Rahul");
		
		lhm.put(null, "Anuj");

		lhm.put(102, "Saurav");

		lhm.entrySet().stream().forEach((m) -> {
			System.out.println(m.getKey() + " " + m.getValue());
		});
	}
}
