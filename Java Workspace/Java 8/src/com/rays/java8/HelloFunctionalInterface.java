package com.rays.java8;

@FunctionalInterface
public interface HelloFunctionalInterface {

	public void sum(int a, int b);

	public default void m1() {
		System.out.println("I am default method");// call by object
	}

	public static void m2() {
		System.out.println("I am static method");//call by name
	}
}
