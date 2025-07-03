package com.java;

public class TestStringBuffer {
	public static void main(String args[]) {
		
	
	StringBuffer sb = new StringBuffer("Vijay ");
	System.out.println(sb);
	
	sb.append("Dinanath Chauhan");
	System.out.println(sb);
	
	sb.replace(1, 5, "ikas");//value is replaced before last index 
	System.out.println(sb);
	
	System.out.println(sb.delete(0, 18));
	System.out.println(sb.reverse());
}

}