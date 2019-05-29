package com.techlabs.basic;

public class InputString {

	public static void main(String[] args) {
		String url = args[0];
		String developer = url.substring(0, url.length() - 11);

		int index = url.indexOf("?");
		

		String rmwww = url.substring(0, index).substring(4, index);

		String company = rmwww.substring(0, rmwww.length() - 4);
			System.out.println("Company=" + company);

		String webdevloper = url.substring(index + 1, developer.length() + 1);
		
		if (webdevloper.equals(""))
			System.out.println("");
		else
			System.out.println(webdevloper);

		String cgpi = url.substring(url.length() - 9);
		if (cgpi.equals(""))
			System.out.println("");
		else
		System.out.println(cgpi);

	}
}
