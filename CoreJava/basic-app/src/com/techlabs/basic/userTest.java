package com.techlabs.basic;

public class userTest {
	public static void main(String[] args) {
		String url=args[0];
		String[]spliturl = url.split("[.?&=]+");
		
		String company=spliturl[1];
		String developer=spliturl[3];
		
		System.out.println("Company="+company);
		if(developer.equals("cgpi")||developer.equals(""))
		{
			
		}
		else
		System.out.println(developer);
		System.out.println("cgpi="+spliturl[spliturl.length-2]+"."+spliturl[spliturl.length-1]);
	}

}
