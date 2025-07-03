package com.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {
	
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add("ram");
		list.add("sita");
		list.add("laxman");
		
		System.out.println(list);
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			
			Object o = it.next();
			System.out.println(o);
			
		}
		
	}

}
