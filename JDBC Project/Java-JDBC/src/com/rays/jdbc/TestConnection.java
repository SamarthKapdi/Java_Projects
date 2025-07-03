package com.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// load driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// make connection to the database
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/samarth", "root", "root");

		// create statement
		Statement stmt = conn.createStatement();

		System.out.println("connection sucessfully");
	}

}