package com.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MarksheetUpdate {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/samarth", "root", "root");
	Statement stmt = conn.createStatement();
	
	int i = stmt.executeUpdate("update marksheet set rollno = 001 where id = 1");
		System.out.println("data updated succesfully" + i);
}
}
                          