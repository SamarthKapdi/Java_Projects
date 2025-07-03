package com.rays.exception;

public class TestArithmetic {
	public static void main(String[] args) {
		int k = 0;
		int i = 15;
		int a = 10;
//		double div = i/k;
//		System.out.println("Div is: " + div);
//		System.out.println("program finish");

		try {										//Exception comes
			double div = i / k;
			double div1 = i / a;

			System.out.println("div is: " + div);
			System.out.println("div is: " + div1);
		} catch (ArithmeticException e) {			//Exception handled
			System.out.println("zero se divide mat karo");
		} finally {									//code will run in any case
			System.out.println("me toh chalunga");
		}

		System.out.println("programme finish");

	}

}
