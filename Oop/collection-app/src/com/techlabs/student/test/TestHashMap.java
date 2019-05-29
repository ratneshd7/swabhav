package com.techlabs.student.test;

import java.util.HashMap;
import java.util.Map;

import com.techlabs.student.Student;

public class TestHashMap {
	public static void main(String[] args) {
		
		HashMap<Student, Student> hset = new HashMap<Student, Student>();
		Student s1=new Student("abc", 101, 10);
	    Student s2=new Student("xyz",101,10);
		Student s3=new Student("jay", 102, 11);
		
		hset.put(s1, s1);
		hset.put(s2, s2);
		hset.put(s3, s3);
		System.out.println(hset.size());
		for(Map.Entry m1: hset.entrySet()){
			System.out.println(m1.getKey()+" "+m1.getValue());
		}
		
		System.out.println();
		HashMap<String, String> s=new HashMap<String,String>();
		s.put("a", "r");
		s.put("hii", "hello");
		s.put("a", "x");
		for(Map.Entry m: s.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}