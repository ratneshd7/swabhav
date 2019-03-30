package com.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.techlabs.rectangle.Rectangle;

public class ReflectionDetails {
	/*Class cls;*/
/*public ReflectionDetails(Class cls) {
		super();
		this.cls = cls;
	}*/
public void printDetails(Class cls){
	System.out.println("The name of class is=" + cls.getSimpleName());
}
public void printConstructor(Class cls){
	Constructor[] cons = cls.getConstructors();
	System.out.println("Constructor are=" + cons.length);
	for (Constructor c2 : cons)
		System.out.println(c2);
	
}
public void printMethod(Class cls) {
	// TODO Auto-generated method stub
	Method[] methods = cls.getDeclaredMethods();
	System.out.println("number of methods are=" + methods.length);
	for (Method method : methods)
		System.out.println(method.getName());
	
}
public void printField(Class cls) {
	// TODO Auto-generated method stub
	Field[] field = cls.getDeclaredFields();
	System.out.println("fields are=" + field.length);
	for (Field f : field)
		System.out.println("field name is=" + f.getName() + "\nfield type= " + f.getType());

}
}
