package com.rays.java.oop.encapsulation;

import java.util.Scanner;

public class TestAccount {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Account acc = new Account();

		System.out.println("Enter account no:");
		String An = sc.next();
		acc.setNumber(An);
		System.out.println("Account No: " + acc.getNumber());

		System.out.println("Enter account type:");
		String At = sc.next();
		acc.setAccountType(At);
		System.out.println("Account Type: " + acc.getaccountType());

		System.out.println("Enter balance:");
		double B = sc.nextDouble();
		acc.setbalance(B);
		System.out.println("Current Balance: " + acc.getbalance());

		
		System.out.println("Enter amount to deposit: ");
		double amt = sc.nextDouble();
		acc.deposit(amt);

		System.out.println("Enter amount for withdrawal: ");
		double Acc = sc.nextDouble();
		acc.withdrawal(Acc);
		
		System.out.println("Enter amount for Fund Transfer:");
		double F = sc.nextDouble();
		acc.fundtransfer(F);
		
		System.out.println("Enter amount to Pay Bill: ");
		double Bp = sc.nextDouble();
		acc.paybill(Bp);
	}
}
