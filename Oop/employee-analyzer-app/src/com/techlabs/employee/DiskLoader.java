package com.techlabs.employee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiskLoader implements Loader {
	String link;

	public DiskLoader(String link2) {
		// TODO Auto-generated constructor stub
		this.link = link2;
	}

	@Override
	public String load() {
		// TODO Auto-generated method stub
		String data;
		String line ="";
		try {
			BufferedReader br = new BufferedReader(new FileReader(link));

			while (true) {
				data = br.readLine();

				if (data == null) {
					break;
				}
				line = line+data+"\n";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return line;
	}

}




































































/*
 * Scanner scanner = null; int index = 0; List<Employee> empList = new
 * ArrayList<>();
 * 
 * while ((line = br.readLine()) != null) {
 * 
 * String employeeName = null; String empId = null; String doj = null; String
 * empdesignation = null; String salary = null; String commission = null; String
 * deptNo = null; String mngrId = null;
 * 
 * scanner = new Scanner(line); scanner.useDelimiter(",");
 * 
 * while (scanner.hasNext()) { String data1 = scanner.next(); if (index == 0)
 * empId = data1; else if (index == 1) employeeName = data1; else if (index ==
 * 2) empdesignation = data1; else if (index == 3) mngrId = data1; else if
 * (index == 4) doj = data1; else if (index == 5) salary = data1; else if (index
 * == 6) commission = data1; else if (index == 7) deptNo = data1; else
 * System.out.println("invalid data::" + data1); index++; } index = 0; Employee
 * emp = new Employee(employeeName, empId, doj, empdesignation, salary,
 * commission, deptNo,mngrId); empList.add(emp); }
 * 
 * // close reader br.close();
 * 
 * System.out.println(empList);
 * 
 * }
 */