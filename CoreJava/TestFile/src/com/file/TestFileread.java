package com.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileread {
	public static void main(String[] args) throws IOException  {
		String data = "Test data";
		String s="hello ";
		/* File f=new File("DataFolder//newFile1.txt");
		 f.createNewFile();*/
		FileOutputStream out = new FileOutputStream("DataFolder//newFile1.txt");
		out.write(s.getBytes());
			out.flush();
		out.write(data.getBytes());
		
		/*out.close();*/
	}
}
		
