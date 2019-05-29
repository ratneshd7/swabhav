package com.techlabs.orderitem;

import java.util.HashMap;

public class TestHashMap {
	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("Ravi", 10);
		map.put("sachin", 30);
		map.put("vinod", 20);

		System.out.println("Size of map is:" + map.size());
		System.out.println(map);
		
		map.remove("Ravi");
		System.out.println(map);
        
        System.out.println(map.get("sachin"));
        map.put("HariOm", 100);
        System.out.println(map);
	}
}
