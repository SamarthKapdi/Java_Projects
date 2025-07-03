package com.java;
//String is non-primitive data types and also a class
public class TestString {
	public static void main(String[] args) {
		String name = "Vijay Dinanath Chauhan";//name is the object of String class
		System.out.println("Name: " + name);//Prints name
		System.out.println("Length: " + name.length());// counts the length of string
		System.out.println("Char: " + name.charAt(6));// prints char of a specific index
		System.out.println("Index: " + name.indexOf('a'));//prints index of a char
		System.out.println("Index from last: " + name.lastIndexOf('a'));//Prints index of a char from last
		System.out.println("Replace with : " + name.replace('a', '@'));//replaces  an old char with new char
		System.out.println("chota vijay: " + name.toLowerCase());//convert whole string to lower case
		System.out.println("bada vijay: " + name.toUpperCase());//convert whole string to upper case
		System.out.println("Starts with: " + name.startsWith("Vij"));//check if the string starts with 
		System.out.println("Ends with: " + name.endsWith("han"));//check if the string ends with
		System.out.println("Index from beginning: " + name.indexOf('a'));//Count index from beginning
		System.out.println("Index from last: " + name.lastIndexOf('a'));//Count index from last
		System.out.println("Substring: " + name.substring(3));// print the remaining string from given index
		System.out.println(name.isBlank());//check if the given string is blank or not
	
		
	}

}
