package com.rays.java.oop.encapsulation;

public class Account {
	private String number;
	private String accountType;
	private double balance;
	
	public String getNumber() {
		return number;
	}
	 
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getaccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
		
	}
	
	public double getbalance() {
		return balance;
	}
	
	public void setbalance(double balance) {
		this.balance = balance;
	}
	
	//Deposit Method
	public synchronized void  deposit(double amt) {
		this.balance = this.balance + amt;
		System.out.println("Balance after Deposit: " + this.balance);
	}
	
	//Withdrawal Method
	public void withdrawal(double amt) {
		if(amt>this.balance) {
			System.err.println("Insufficient Balance to Withdrawal");
			} else{
				this.balance = this.balance  - amt;
				System.out.println("Balance after Withdrawal: " + this.balance);
			}
	}
	
	
	
	public void fundtransfer(double amt) {
		this.balance = balance - amt;
		System.out.println("Balance after fund transfer: "+this.balance);
	}
	
	public void paybill(double amt) {
		this.balance = balance - amt;
		System.out.println(" Balance after bill payment: " + this.balance);
	}
}
