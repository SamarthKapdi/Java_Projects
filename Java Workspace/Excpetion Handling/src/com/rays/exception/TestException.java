package com.rays.exception;

public class TestException {
	public static void main(String[] args) {
		String name ="Samarth";
		
	try {
		System.out.println(name.length());
		System.out.println(name.charAt(5));
	} catch (Exception e) {
		System.out.println("exception: " + e.getMessage());
	} finally {
		System.out.println("Mai Brahman hu");
	}
		
	}

}
