package com.rays.collection.set;

import java.util.HashSet;
import java.util.Set;

// 1. set contain only unique value
// 2. set contain only one null value
// 3. order of set is sorting order by default asc
public class TestSet {
	
	public static void main(String[] args) {
		
		Set s = new HashSet();
		
		s.add('b');
		s.add('c');
		s.add('a');
		s.add('a');
		s.add(null);
		s.add(null);
		
		System.out.println(s);
		
		System.out.println(s.iterator());
		
	}

}
