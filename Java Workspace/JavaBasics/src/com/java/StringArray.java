package com.java;

public class StringArray {
	//for-each loop 
	public static void main(String[] args) {
	
	String [] str = {"Shree", "Krishna", "Govind", "Hare", "Murari"};
	System.out.println(str[1]);
	
	System.out.println("--for each loop--");
	
	for(String s: str) {
		System.out.println(s);
	}
	
	}
}
