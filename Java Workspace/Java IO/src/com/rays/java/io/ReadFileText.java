package com.rays.java.io;

import java.io.FileReader;
import java.io.IOException;

public class ReadFileText {
	
	public static void main(String[] args) throws IOException {
		FileReader in = new FileReader("D:\\IO\\Hello.txt");
		
		int i = in.read();
		
		while(i != -1) {
			System.out.print((char) i + "");
			i = in.read();
		}
		in.close();
	}

}
