package com.chap16;

import java.util.HashMap;

public class TestMap {
public static void main(String[] args) {
	HashMap<String, Integer> hm=new HashMap<>();
	hm.put("ratnesh", 500);
	hm.put("ramesh", 400);
	hm.put("rahul", 300);
	System.out.println(hm);
	System.out.println(hm.get("rahul"));
	
}
}
