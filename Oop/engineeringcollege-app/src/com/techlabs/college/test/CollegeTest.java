package com.techlabs.college.test;

import com.techlabs.college.Branch;
import com.techlabs.college.Professor;
import com.techlabs.college.Student;

public class CollegeTest {
	public static void main(String[] args) {
		Professor professor = new Professor(1, "Borivali", "1st jan,2002", "Maths", 1200);
	    Student student=new Student(2,"kandivali","1st jan,2002",Branch.COMPUTER);
	    
	    System.out.println(professor);
	    System.out.println(student);
	}
}
