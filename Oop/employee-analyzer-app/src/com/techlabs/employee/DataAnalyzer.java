package com.techlabs.employee;

import java.util.HashMap;
import java.util.HashSet;

public class DataAnalyzer {
	HashSet<Employee> employees;
	private Parser parser;

	public DataAnalyzer(Parser parser) {
		// TODO Auto-generated constructor stub
		this.parser = parser;
		loadData();
	}

	public void loadData() {
		// TODO Auto-generated method stub
		employees = parser.dataloadParser();
	}

	public Employee getMaxSalary() {
		// TODO Auto-generated method stub
		double max = 0;
		Employee emp = null;
		for (Employee employ : employees) {
			if (max < employ.getSalary()) {
				emp = employ;
				max = employ.getSalary();
			}
		}
		return emp;
	}

	public HashMap<Integer, Integer> getDeptWiseEmp() {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> dep = new HashMap<>();
		int value = 0;
		for (Employee employ : employees) {

			if (dep.containsKey(employ.getDeptNo())) {
				value = dep.get(employ.getDeptNo());
				value++;
				dep.put(employ.getDeptNo(), value);
			} else
				dep.put(employ.getDeptNo(), 1);
		}

		return dep;
	}

	public HashMap<String, Integer> getDesignwiseEmpl() {
		// TODO Auto-generated method stub
		HashMap<String, Integer> design = new HashMap<>();
		int value = 0;
		for (Employee employee : employees) {
			if (design.containsKey(employee.getEmpdesignation())) {
				value = design.get(employee.getEmpdesignation());
				value++;
				design.put(employee.getEmpdesignation(), value);
			} else
				design.put(employee.getEmpdesignation(), 1);
		}

		return design;
	}

}
