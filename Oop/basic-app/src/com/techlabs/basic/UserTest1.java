package com.techlabs.basic;

public class UserTest1 {
	public static void main(String[] args) {
		String url = args[0];
		String[] spliturl = url.split("[.?&=]+");
		String company=spliturl[1];
		System.out.println("Company="+company);
		for(int i=0;i<spliturl.length;i++){
			if(spliturl[i].equals("developer")){
				i++;
				System.out.println("Developer="+spliturl[i]);
			}
			if(spliturl[i].equals("cgpi")){
				i++;
				System.out.println("CGPI="+spliturl[i]+"."+spliturl[i+1]);
			}
		}
	}
}
