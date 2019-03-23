package com.properties;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
public class TestProperty {
	public static void main(String[] args) throws IOException {
		Properties property = new Properties();
		File file = new File("DataFolder//TestProperties.properties");
	
		property.setProperty("user", "ratnesh");
		property.setProperty("password", "12345");
		property.setProperty("IP", "198.162.28.24");
		
		property.store(new FileWriter(file), "property file is ceated");
		
		System.out.println("user="+property.getProperty("user"));
		System.out.println("password="+property.getProperty("password"));
		System.out.println("IP="+property.getProperty("IP"));
	
	}
}
