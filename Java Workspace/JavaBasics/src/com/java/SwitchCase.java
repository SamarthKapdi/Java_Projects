package com.java;

public class SwitchCase {
	public static void main(String [] args) {
		int day=3;
		String dayString = null;
		
		switch (day) {
		case 0:
			dayString = "Sunday";
			break;
		case 1:
			dayString = "Monday";
			break;
		case 2:
			dayString = "Tuesday";
			break;
			
		default:
			dayString = "This day is yet to come, pl wait";
		}
		System.out.println(dayString);
		
		}
		
	}
	

