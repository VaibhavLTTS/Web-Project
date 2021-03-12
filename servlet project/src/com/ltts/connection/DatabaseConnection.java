package com.ltts.connection;
import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

	public static Connection getConnection() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection  con =DriverManager.getConnection("jdbc:mysql://localhost:3306/vaibhav","root","root");
		return con;
		
	}
	
}
