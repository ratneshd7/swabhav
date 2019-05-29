package com.techlabs.salaryslip;

public class Manager extends AnnualSalary {
	private double hra = 40;
	private double ta = 30;
	private double da = 20;

	public Manager(double basic_salary, int emp_id, String emp_name) {
		super(basic_salary, emp_id, emp_name);
		// TODO Auto-generated constructor stub
	}

	public double getHra() {
		return hra;
	}

	public double getDa() {
		return da;
	}

	public double getTa() {
		return ta;
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub

		return (basic_salary + ((ta * basic_salary) / 100) + ((hra * basic_salary) / 100)
				+ ((da * basic_salary) / 100));
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nTotal Salary: "+calculateSalary()+"\nHRA: "+hra+"\nDA: "+da+"\nTA: "+ta;
	}

}
