package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	
	public static void main(String[] args) {
		
Collection c = new ArrayList();
		
		c.add('a');
		c.add(2);
		c.add(true);
		c.add("KGF");
		
		System.out.println("Collection: " + c);
		System.out.println("Size of Collection " + c.size());
		
	}

}
