package com.rays.java.oop.encapsulation;
import java.util.Date;
public class TestPerson {
	public static void main(String[] args) {
		
		Person p = new Person();
		
		p.setName("Ram");
		System.out.println(p.getName());
	
		p.setDob(new Date());
		System.out.println(p.getDob());
		
		p.setAddress("Indore");
		System.out.println(p.getAddress());
		
	System.out.println("----------");
	
	Person p1 = new Person();
	p1.setName("Shyam");
	System.out.println(p1.getName());
	
	p1.setDob(new Date());
	System.out.println(p1.getDob());
	
	p1.setAddress("Ujjain");
	System.out.println(p1.getAddress());

}
}
