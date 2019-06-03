package com.factory.method;

public class TeslaFactory implements IAutomobileFactory {

	private static IAutomobile automobile;
	private TeslaFactory() {}

	
	@Override
	public IAutomobile make() {
		// TODO Auto-generated method stub
		
		if(automobile==null)
			return  new Tesla();
		return  automobile;
	}
	
	public static IAutomobileFactory getInstatnce(){
		return new TeslaFactory();
		
	}

}
