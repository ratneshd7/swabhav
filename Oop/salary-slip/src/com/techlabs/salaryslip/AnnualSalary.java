package com.techlabs.salaryslip;

abstract class AnnualSalary {
	protected double basic_salary;
	private int emp_id;
	private String emp_name;

	/*
	 * private double hra; private double ta; private double da; private double
	 * pa;
	 */
	/*
	 * public AnnualSalary(double basic_salary, int emp_id, String emp_name,
	 * double hra,double ta,double da,double pa) { super(); this.basic_salary =
	 * basic_salary; this.emp_id = emp_id; this.emp_name = emp_name;
	 * this.hra=0.04*basic_salary+; this.da=; this.ta=ta; this.pa=pa; }
	 */
	public AnnualSalary(double basic_salary, int emp_id, String emp_name) {
		super();
		this.basic_salary = basic_salary;
		this.emp_id = emp_id;
		this.emp_name = emp_name;
	}

	public double getBasic_salary() {
		return basic_salary;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	abstract double calculateSalary();

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Basic Salary: " + basic_salary + "\nEmp Id: " + emp_id + "\nEmp Name: " + emp_name;
	}

}
