package com.factory.method;

public class BmwFactory implements IAutomobileFactory{
	private static IAutomobile automobile;
	private BmwFactory() {}

	 
	@Override
	public IAutomobile make() {
		// TODO Auto-generated method stub
		//getInstatnce();
		if(automobile==null)
			return  new Bmw();
		return  automobile;
	}
	
	public static IAutomobileFactory getInstatnce(){
		return new BmwFactory();
		
	}
	

}
