package com.rays.oop.abstarction;

public class AmbaniInterface implements Richman {
	@Override
	public void earnMoney(int i) {
		System.out.println("Money earned: " + i);
		
	}

	@Override
	public void donation() {
		System.out.println("Amount donated: ");		
	}

	@Override
	public void party() {
		System.out.println("Party: ");
		
	}


	
}
