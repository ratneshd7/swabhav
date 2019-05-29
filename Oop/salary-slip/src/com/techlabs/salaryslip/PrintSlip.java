package com.techlabs.salaryslip;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PrintSlip {
	public static void main(String[] args) throws Exception {

		AnnualSalary a1 = new Manager(10000, 1, "Ratnesh");
		
		FileWriter fw= new FileWriter("new.html");
        File file =new File(a1.toString());
        
		printDetails(a1);
		AnnualSalary a2 = new Developer(20000, 2, "Mahesh");
		printDetails(a2);
		AnnualSalary a3 = new Accountant(15000, 3, "Manish");
		printDetails(a3);
		
		//Desktop.getDesktop().browse(fw.toString().toURI());
		
	}

	private static void printDetails(AnnualSalary a) {
		// TODO Auto-generated method stub
		// System.out.println("\nEmp_id: "+a.getEmp_id()+"\nBasic_salary:
		// "+a.getBasic_salary()+"\nEmp_Name: "+a.getEmp_name()+"\nTotal salary:
		// "+a.calculateSalary());
		System.out.println(a);
	}
}