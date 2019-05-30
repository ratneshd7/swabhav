package com.techlabs.employee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.xml.stream.util.StreamReaderDelegate;

public class WebLoader implements Loader {
	String link;

	public WebLoader(String link) {
		// TODO Auto-generated constructor stub
		this.link = link;
	}

	@Override
	public String load() {
		// TODO Auto-generated method stub
		String line ="";
		String data;
		try {
			BufferedReader in = new BufferedReader(
					new InputStreamReader(new URL(link).openConnection().getInputStream()));
			while ((data = in.readLine()) != null) {
				line = line+data+"\n";
			}
in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return line.toString();
	}

}













































/*
 * String line = null;
 * 
 * Scanner scanner = null; int index = 0; List<Employee> empList = new
 * ArrayList<>();
 * 
 * while ((line = in.readLine()) != null) {
 * 
 * String employeeName = null; String empId = null; String doj = null; String
 * empdesignation = null; String salary = null; String commission = null; String
 * deptNo = null; String mngrId = null;
 * 
 * scanner = new Scanner(line);
 * 
 * scanner.useDelimiter(",");
 * 
 * while (scanner.hasNext()) { String data = scanner.next(); if (index == 0)
 * empId = data; else if (index == 1) employeeName = data; else if (index == 2)
 * empdesignation = data; else if (index == 3) mngrId = data; else if (index ==
 * 4) doj = data; else if (index == 5) salary = data; else if (index == 6)
 * commission = data; else if (index == 7) deptNo = data; else
 * System.out.println("invalid data::" + data); index++; } index = 0; Employee
 * emp = new Employee(employeeName, empId, doj, empdesignation, salary,
 * commission, deptNo, mngrId); empList.add(emp); }
 * 
 * // close reader in.close();
 * 
 * System.out.println(empList);
 * 
 * }
 * 
 * while(true){ i=in.read(); if(i==(-1)) break; data=""+(char)i; }
 * 
 * 
 * } catch (MalformedURLException e) { // TODO Auto-generated catch block
 * e.printStackTrace(); }
 * 
 */
