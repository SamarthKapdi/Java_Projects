package com.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MarksheetInsert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/samarth", "root", "root");
		Statement stmt = conn.createStatement();
		

		int i = stmt.executeUpdate("insert into marksheet values (21, 121, 'Sharma', 50, 60, 70)");
			System.out.println("data insert succesfully" + i);
		
	}		
	
}

