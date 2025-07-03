package com.java;

public class PalindromeNo {
	public static void main(String[] args) {
			int i = 333;
			int temp = i; //variable; temp = i
			int r = 0;
			int rnum = 0;

			while (temp > 0) {
				r = temp % 10; //gives remainder
				rnum = rnum * 10 + r;
				temp = temp / 10;
			}
			if(i == rnum) {
			System.out.println("is Palindrome");

		}
			else {
				System.out.println("not palindrome");
			}
	}


}
