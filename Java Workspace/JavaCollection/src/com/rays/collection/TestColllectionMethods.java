package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestColllectionMethods {
	public static void main(String[] args) {
		
	
	Collection c1 = new ArrayList();
	c1.add(2);
	c1.add("2");
	System.out.println("Collection 1: " + c1);
	System.out.println("Size of C1:" + c1.size());
	
	System.out.println("---------------");
	
	Collection c2 = new ArrayList();
	c2.add(4);
	c2.add("4");
	System.out.println("Collection 2: " + c2);
	System.out.println("Size of C2:" + c2.size());
	
	System.out.println("----------------");
	
	c1.addAll(c2);
	System.out.println("C1:" + c1);
	
	System.out.println("---------");
	System.out.println(c1.contains(4));
	System.out.println(c1.contains(6));
	System.out.println(c1.containsAll(c2));
	//c1.clear();
	System.out.println(c1.isEmpty());
	c1.remove(2);
	System.out.println("c1: " + c1);
	c1.removeAll(c2);
	System.out.println("c1: " + c1);
}
}