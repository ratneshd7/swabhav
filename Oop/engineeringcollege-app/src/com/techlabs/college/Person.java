package com.techlabs.college;

public class Person {

	private int id;
	private String address, dob;

	public Person(int id, String address, String dob) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.address = address;
		this.dob = dob;

	}
	public int getId() {
		return id;
	}
	public String getAddress() {
		return address;
	}
	public String getDob() {
		return dob;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n ID:"+getId()+"\nAddress:"+getAddress()+"\nDOB:"+getDob();
	}
}
