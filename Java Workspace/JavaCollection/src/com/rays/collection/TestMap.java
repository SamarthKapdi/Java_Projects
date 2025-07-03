package com.rays.collection;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
	
	public static void main(String[] args) {
		
		Map m = new HashMap();
		
		m.put("one", 1);
		m.put("two", 2);
		m.put("three", 4);
		
		System.out.println("map: " + m);
		System.out.println(m.get("three"));
		System.out.println(m.containsKey("three"));
		System.out.println(m.containsValue(4));
		System.out.println(m.entrySet());
		System.out.println(m.keySet());
		System.out.println(m.values());
		m.remove("three");
		System.out.println(m);
		
	}

}
