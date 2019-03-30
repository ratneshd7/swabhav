package com.java.relection.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.java.reflection.ReflectionApp;

public class ReflectionTest {
	public static void main(String[] args) throws  SecurityException, NoSuchFieldException {
		// ReflectionApp r = null;
		ReflectionApp reflection = new ReflectionApp("ratnesh");

		Class clas = reflection.getClass();
		System.out.println("The name of class is " + clas.getName());

		Constructor constructor = clas.getEnclosingConstructor();
		System.out.println("The name of constructor is " + constructor.getName());

		System.out.println("The public methods of class are : ");

		Method[] methods = clas.getMethods();
		for (Method method : methods)
			System.out.println(method.getName());
		Field field = clas.getDeclaredField("name");
		// field.setAccessible(true);
		System.out.println(field.getName() + " " + field.getModifiers());

	}
}
