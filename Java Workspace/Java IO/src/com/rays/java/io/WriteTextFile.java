package com.rays.java.io;

import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {
	
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("D:\\IO\\Hello.txt");
		
		
		fw.write("Hello, Samarth");
		System.out.println("Successfully....");
		
		fw.close();
		
	} 

}
