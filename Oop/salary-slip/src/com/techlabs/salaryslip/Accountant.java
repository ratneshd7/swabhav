package com.techlabs.salaryslip;

public class Accountant extends AnnualSalary{
private double perks=20;

	public Accountant(double basic_salary, int emp_id, String emp_name) {
		super(basic_salary, emp_id, emp_name);
		// TODO Auto-generated constructor stub
	}

	public double getPerks() {
		return perks;
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return (basic_salary + ((perks * basic_salary) / 100));
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nTotal Salary: "+calculateSalary()+"\nPERKS: "+perks;
	}
}
