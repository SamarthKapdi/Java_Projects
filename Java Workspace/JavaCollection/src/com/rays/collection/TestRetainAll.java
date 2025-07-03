package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestRetainAll {
	
	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		
		c.add(5);
		c.add(6);
		
		Collection c1 = new ArrayList();
		
		c1.add(6);
		c1.add(4);
		
		c.retainAll(c1);
		System.out.println(c);
		
	}

}
