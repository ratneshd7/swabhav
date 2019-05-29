package com.techlabs.student;

import java.security.GeneralSecurityException;

public class Student {
	private String name;
	private int rollno;
	private int standard;

	public Student(String name, int rollno, int std) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.rollno = rollno;
		this.standard = std;

	}
	public String getName(){
		return name;
	}
	public int getRollno(){
		return rollno;
		
	}
	public int getStandard(){
		return standard;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nName: "+getName()+"\nRollNo: "+getRollno()+"\nStandard: "+getStandard()+"\n";
	}
	/*@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.getRollno();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Student s=(Student)obj;
		
		if(this.getRollno() == s.getRollno()){
	        return true;
	    } else {
	        return false;
	    }  
	}*/
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if((this.getRollno() == ((Student)obj).getRollno())&&(this.getStandard()==((Student)obj).getStandard())){
	        return true;
	    } else {
	        return false;
	    }  
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Integer.parseInt(this.getRollno()+""+this.getStandard());
	}
	
	
}
