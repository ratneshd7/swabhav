package com.techlabs.college;

public class Student extends Person {
	private Branch branch;

	public Student(int sid, String saddress, String sdob, Branch branch) {
		super(sid, saddress, sdob);
		this.branch = branch;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+ "\nBranch:"+branch;
	}
}
