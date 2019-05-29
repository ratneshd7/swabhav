package com.techlabs.student.test;

import java.util.HashSet;

import com.techlabs.student.Student;

public class TestHashSet {
public static void main(String[] args) {
	HashSet<Student> set=new HashSet<>();
	set.add(new Student("Ratnesh",1,12));
	set.add(new Student("Ram", 2, 11));
	set.add(new Student("Ratnesh", 3, 10));
	
	System.out.println(set);
}
}
