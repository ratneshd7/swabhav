package com.techlabs.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface needToRefractor {
}

class Foo {

	@needToRefractor
	void m1() {
		System.out.println("in m1");

	}

	void m2() {
		System.out.println("in m2");
	}

	void m3() {
		System.out.println("in m3");
	}

	@needToRefractor
	void m4() {
		System.out.println("in m4");

	}

}
