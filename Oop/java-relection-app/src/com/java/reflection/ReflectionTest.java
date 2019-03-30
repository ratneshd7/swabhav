package com.java.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.java.reflection.ReflectionApp;

public class ReflectionTest {
	public static void main(String[] args) throws SecurityException, NoSuchFieldException, NoSuchMethodException {
		// ReflectionApp r = null;
		/* ReflectionApp reflection = new ReflectionApp("ratnesh"); */
		String reflection = new String();
		Class clas = reflection.getClass();

		System.out.println("The name of class is=" + clas.getSimpleName());
		/* System.out.println("The name of class is--> " + clas.getName()); */

		/*
		 * Constructor constructor = clas.getConstructor(String.class);
		 * printConstructorDetails(constructor);
		 */

		Constructor[] cons = clas.getConstructors();
		printConstructorDetails2(cons);

		Method[] methods = clas.getDeclaredMethods();
		System.out.println("number of methods are=" + methods.length);
		printMethodDetails(methods);

		Field[] field = clas.getDeclaredFields();
		System.out.println("fields are=" + field.length);
		for (Field f : field)
			System.out.println("field name is=" + f.getName() + "\nfield type= " + f.getType());

	}

	private static void printConstructorDetails2(Constructor[] cons) {
		// TODO Auto-generated method stub
		System.out.println("Constructor are=" + cons.length);
		for (Constructor c2 : cons)
			System.out.println(c2);
	}

	private static void printMethodDetails(Method[] methods) {
		// TODO Auto-generated method stub

		for (Method method : methods)
			System.out.println(method.getName());

	}

	/*
	 * private static void printConstructorDetails(Constructor constructor) { //
	 * TODO Auto-generated method stub System.out.println(
	 * "The name of constructor is " + constructor.getName());
	 * System.out.println(constructor.getParameterCount()); }
	 */
}
