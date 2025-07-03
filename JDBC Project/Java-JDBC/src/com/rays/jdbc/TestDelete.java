package com.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDelete {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/samarth", "root", "root");
	Statement stmt = conn.createStatement();
	
	int i = stmt.executeUpdate("delete from user where id = 5");
		System.out.println("data deleted succesfully" + i);
}
}
