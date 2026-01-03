package com.rays.bundle;

import java.util.ResourceBundle;

public class TestBundle {
	public static void main(String[] args) {

		ResourceBundle rb = ResourceBundle.getBundle("com.rays.bundle.app");

		String url = rb.getString("url");
		System.out.println(url);

		String driver = rb.getString("driver");
		System.out.println(driver);

		String username = rb.getString("username");
		System.out.println(username);
	}

}
