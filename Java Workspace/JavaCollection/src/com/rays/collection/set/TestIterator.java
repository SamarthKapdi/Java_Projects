package com.rays.collection.set;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {
	
	public static void main(String[] args) {
		
		ArrayList set = new ArrayList();
		
		set.add("ram");
		set.add("sita");
		set.add("laxman");
		
		System.out.println(set);
		
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			
			Object o = it.next();
			System.out.println(o);
			
		}
		
	}

}
