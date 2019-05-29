package com.techlabs.salaryslip;

public class Developer extends AnnualSalary {
	private double pa=30;

	public Developer(double basic_salary, int emp_id, String emp_name) {
		super(basic_salary, emp_id, emp_name);
		// TODO Auto-generated constructor stub
	}

	public double getPa() {
		return pa;
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub

		return (basic_salary + ((pa * basic_salary) / 100));
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nTotal Salary: "+calculateSalary()+"\nPA: "+pa;
	}
}
