package com.rays.threads;

public class HelloRunnable implements Runnable {

	
	String name;
	
	public  HelloRunnable(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =1; i<=3; i++) {
			System.out.println(i + name);
		}
		
	}
	
	
	

}
