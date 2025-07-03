package com.java;

import java.util.Scanner;

public class TestScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		
		
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		
		System.out.println("Enter your salary: ");
		float salary = sc.nextFloat();
		
		System.out.println("Name = " + name);
		System.out.println("Age = " + age);
		System.out.println("Salary = " + salary);
		
	}

}
