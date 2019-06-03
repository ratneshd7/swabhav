package com.factory.method.test;

import java.io.FileReader;
import java.util.Properties;

import com.factory.method.IAutomobile;
import com.factory.method.IAutomobileFactory;

public class TestFactoryMethod {

	public static void main(String[] args) {
		// IAutomobileFactory factory = TeslaFactory.getInstatnce();

		try {
			String class1 = loadFactoryFromFile();
			System.out.println(class1);
			System.out.println(Class.forName(class1));
			IAutomobileFactory factory = null;
			factory= (IAutomobileFactory)Class.forName("com.factory.method.BmwFactory").newInstance();
		//	factory = (IAutomobileFactory) Class.forName(class1).newInstance();
			System.out.println(factory);
			IAutomobile auto = factory.make();
			System.out.println(auto);
			auto.star();
			auto.stop();
			// System.out.println(auto.getClass().getSimpleName());
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static String loadFactoryFromFile() {

		try {

			FileReader reader = new FileReader(
					"E://Swabhav Repository//DesignPattern//factory-method-app//src//form.properties");

			Properties p = new Properties();
			p.load(reader);

			return p.getProperty("load");

		} catch (Exception e) {

			e.printStackTrace();
		}
		return null;
	}
}
