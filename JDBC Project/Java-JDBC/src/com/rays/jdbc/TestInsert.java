package com.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestInsert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/samarth", "root", "root");
		Statement stmt = conn.createStatement();
		
		
		int i = stmt.executeUpdate("insert into user values (4, 'Shyam', 'Sharma', 'shyam@gmail.com', 'shyam123', '2005-02-03')");
			System.out.println("data insert succesfully" + i);
		
	}		
	
}

