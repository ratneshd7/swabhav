package com.file;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestHtml {
	public static void main(String[] args) throws IOException {
		File create = new File("DataFolder//TestHtml.html");
		BufferedWriter bw = new BufferedWriter(new FileWriter(create));
		bw.write("<html><head><title>New Page</title></head><body><p>This is Body</p></body></html>");
		bw.close();
		Desktop.getDesktop().browse(create.toURI());
	}
}
