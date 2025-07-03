package com.rays.exception;

public class TestLoginException  {
	public static void main(String[] args) throws LoginException {
		
		String loginId  = "Samarth123";
		
		if(loginId == "Samarth123") {
			System.out.println("Logged in succesfully");
		} else {
			throw new LoginException();//To call exception made by programmer
			
		}
	}
	}