package com.file;

import java.io.PrintWriter;
import java.io.Writer;

public class TestFlushClose {
public static void main(String[] args) {
	String s="hii";
	Writer write=new PrintWriter(System.out);
	try{
		write.append(s);
		write.flush();
		write.append(" "+"hello");
	//	write.close();
		write.append(" "+"new");
		write.flush();
	}
	catch(Exception e){
		e.printStackTrace();
	}
}
}
