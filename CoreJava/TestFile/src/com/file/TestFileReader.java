package com.file;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestFileReader {
	public static void main(String[] args) throws IOException {
		File file = new File("DataFolder//File1");
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String st;
		String url = "DataFolder//NewFile.html";
		File htmlFile = new File(url);
		Desktop.getDesktop().browse(htmlFile.toURI());

		while ((st = reader.readLine()) != null) {
			System.out.println(st);
		}
	}
}
