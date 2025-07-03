package com.rays.collection.list;
//Last In First Out(LIFO)/(FILO)
import java.util.Stack;

public class TestStack {
	public static void main(String[] args) {
		Stack s = new Stack();
		
		s.push(5);
		s.push(6);
		s.push(7);
		s.push(8);
		
		System.out.println(s);
		
		System.out.println(s.peek());
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		
	}

}
