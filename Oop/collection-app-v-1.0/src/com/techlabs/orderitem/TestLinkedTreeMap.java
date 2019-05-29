package com.techlabs.orderitem;

import java.util.Map;
import java.util.TreeMap;

public class TestLinkedTreeMap {
	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(100, "Amit");
		map.put(102, "Ravi");
	
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		map.remove(102);//remove operation
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		 map.put(99, "HariOm");
		 System.out.println(map);
	}
}
