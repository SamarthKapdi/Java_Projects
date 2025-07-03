package com.rays.collection.list;

import java.util.ArrayList;
import java.util.List;

// 1. list contain multiple duplicate value
// 2. list contain multiple null value
// 3. order of list is natural order
public class TestList {
	
	public static void main(String[] args) {
		
		List l = new ArrayList();
		
		l.add("ram");
		l.add(56);
		l.add(5.6);
		l.add("ram");
		l.add(null);
		l.add(null);
		l.add("ram");

		
		System.out.println(l);
		System.out.println(l.get(2));
		l.remove(2);
		System.out.println(l);
		l.set(0, "shyam");
		System.out.println(l);
		System.out.println(l.indexOf("ram"));
		System.out.println(l.lastIndexOf("ram"));
		System.out.println(l.subList(1, 4));
		
	}

}
