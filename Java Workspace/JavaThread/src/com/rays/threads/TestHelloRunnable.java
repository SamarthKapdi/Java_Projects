package com.rays.threads;

public class TestHelloRunnable {
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new HelloRunnable("Ram"));
		Thread t2 = new Thread(new HelloRunnable("Shyam"));
		t1.setPriority(10);
		t1.setDaemon(true);//support and background thread
		t1.start();
		t2.start();
	}

}