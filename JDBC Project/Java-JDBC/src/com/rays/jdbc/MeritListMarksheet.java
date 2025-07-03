package com.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MeritListMarksheet{
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
     
        Class.forName("com.mysql.cj.jdbc.Driver");

        
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/samarth", "root", "root");

     
        Statement stmt = conn.createStatement();

      
        ResultSet rs = stmt.executeQuery("SELECT *, (phy + chm + maths) AS total FROM marksheet ORDER BY total DESC LIMIT 5");

        System.out.println("Top 5 Students:");
        System.out.println("ID RollNo Name Phy Chm Maths Total");


    
        while (rs.next()) {
            int id = rs.getInt("id");
            int rollNo = rs.getInt("rollNo");
            String name = rs.getString("name");
            int phy = rs.getInt("phy");
            int chm = rs.getInt("chm");
            int maths = rs.getInt("maths");
            int total = rs.getInt("total");

            System.out.println(id + " " + rollNo + " " + name + " " + phy + " " + chm + " " + maths + " " + total);

        }
}
}