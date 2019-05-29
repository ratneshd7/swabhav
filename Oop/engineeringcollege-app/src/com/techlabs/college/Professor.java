package com.techlabs.college;

public class Professor extends Person implements SalariedEmployee {
	private String subject;
	private double salary;

	public Professor(int id, String address, String dob, String sub, double salary) {
		super(id, address, dob);
		// TODO Auto-generated constructor stub
		this.subject = sub;
		this.salary = salary;
	}

	public String getSubject() {
		return subject;
	}

	public double getSalary() {
		return calSalary();
	}

	@Override
	public double calSalary() {
		// TODO Auto-generated method stub
		return salary * 12;
	}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString()+ "\nSubject:"+getSubject()+"\nSalary:"+getSalary();
}
}
