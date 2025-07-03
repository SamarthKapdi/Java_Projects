package com.java;


import java.text.SimpleDateFormat;
import java.util.*;
public class TestDate {
	public static void main(String[] args) {
		
	
	Date d = new Date();
	System.out.println("current Date & Time = " + d);

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss");
	
	System.out.println(sdf.format(d));
	System.out.println(time.format(d));
}
}