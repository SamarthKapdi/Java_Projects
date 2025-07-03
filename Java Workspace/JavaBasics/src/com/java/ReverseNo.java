package com.java;

public class ReverseNo {
	public static void main(String[] args) {
		int i = 264;
		int temp = i;//declare variable; temp = i
		int r = 0;//declare  r
		int rnum = 0;//declare rnum

		while (temp > 0) {
			r = temp % 10;//gives remainder
			rnum = rnum * 10 + r;
			temp = temp / 10;//removes remainder
		}
		System.out.println("ReverseNo of  " + i + " is " + rnum);

	}

}
