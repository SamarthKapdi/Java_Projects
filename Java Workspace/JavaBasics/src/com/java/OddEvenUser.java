package com.java;

import java.util.Scanner;

public class OddEvenUser {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your no:");
		
	
		int a = sc.nextInt();
		if(a % 2 == 0) {
			System.out.println(a + "  is even");
		}
		else {
			System.out.println(a + "  is odd");
		}

}

}