package com.techlabs.employee;

import java.util.HashSet;

public class Parser {
	private Loader loader;

	public Parser(Loader load) {
		// TODO Auto-generated constructor stub
		this.loader = load;
	}

	public HashSet<Employee> dataloadParser() {
		HashSet<Employee> empData = new HashSet<>();
		String data = loader.load();
		String[] splitlines = data.split("\n");
		for (String l : splitlines) {
			System.out.println(l);
		}
		for (String line : splitlines) {
			if (line == "")
				continue;
			line = line.replace("'", "");
			String[] record = line.split(",");
			Employee emp = new Employee();

			emp.setDeptNo(Integer.parseInt(record[0]));
			emp.setEmployeeName(record[1]);
			emp.setEmpdesignation(record[2]);
			if (record[3].equals("NULL"))
				emp.setMngrId(0);
			else
				emp.setMngrId(Integer.parseInt(record[3]));

			emp.setDoj(record[4]);
			emp.setSalary(Double.parseDouble(record[5]));
			emp.setEmpdesignation(record[2]);
			if (record[6].equals("NULL"))
				emp.setCommission(0);
			else
				emp.setCommission(Integer.parseInt(record[6]));
			emp.setDeptNo(Integer.parseInt(record[7]));

			empData.add(emp);
		}

		return empData;
	}
}
