package com.techlabs.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

class AnnotationDemo {
	public static void main(String[] args) {
		Foo foo = new Foo();

		Class c = foo.getClass();
		System.out.println("Class name is:" + foo.getClass().getSimpleName());

		Annotation an = c.getAnnotation(needToRefractor.class);
		needToRefractor n = (needToRefractor) an;
		System.out.println(n);
		foo.m1();

		countMethodsWithAnnotation(foo.getClass(), needToRefractor.class);

	}

	private static void countMethodsWithAnnotation(Class<?> class1, Class<? extends Annotation> annotation) {
		// TODO Auto-generated method stub

		int count = 0;
		for (Method m : class1.getMethods()) {
			if (m.isAnnotationPresent(annotation)) {
				count++;
			}
		}
		System.out.println(count);
	}
}
