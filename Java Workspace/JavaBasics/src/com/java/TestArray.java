package com.java;

public class TestArray {
	public static void main(String[] args) {
		int [] i = {5,6,7,8,9};
		
		String [] str = {"Shree", "Krishna", "Govind", "Hare", "Murari"};
		System.out.println(str[1]);
		System.out.println(i[3]);
		System.out.println("--for each loop--");
		for(int a:i){
			System.out.println(a);
		}
		for(String b: str) {
			System.out.println(b + "5");
		}
	}


}
