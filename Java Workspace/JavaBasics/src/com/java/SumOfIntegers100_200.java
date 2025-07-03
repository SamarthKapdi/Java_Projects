package com.java;

public class SumOfIntegers100_200 {

	public static void main(String[] args) {
		int sum = 0;
		for (int a = 100; a < 200; a++) {
			if (a % 7 == 0) {
				System.out.println(a);
				sum = sum + a;
			}
		}
		System.out.println("Sum: " + sum);
	}

}
