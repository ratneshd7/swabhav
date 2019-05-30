package com.techlabs.employee.analyzer;

import com.techlabs.employee.DataAnalyzer;
import com.techlabs.employee.DiskLoader;
import com.techlabs.employee.Parser;
import com.techlabs.employee.WebLoader;

public class DataAnalyzerTest {
	public static void main(String[] args) {
		
		  DataAnalyzer analyzer=new DataAnalyzer(new Parser(new WebLoader("https://swabhav-tech.firebaseapp.com/emp.txt")));
		 // analyzer.loadData();
		  System.out.println(analyzer.getMaxSalary());
		  System.out.println(analyzer.getDeptWiseEmp());
		  System.out.println(analyzer.getDesignwiseEmpl());
		 
		
	}
}
