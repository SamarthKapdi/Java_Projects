package com.rays.exception;

public class TestAccount {
	public static void main(String[] args) throws InsufficientFundException {
		
		double balance  = 10000;
		double withdraw = 2000;
		if(withdraw>balance) {
			throw new InsufficientFundException();
		} else {
			balance = balance - withdraw;
			System.out.println(balance);
		}
	}
}