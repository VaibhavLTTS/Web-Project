package com.ltts.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ltts.connection.DatabaseConnection;
import com.ltts.model.User;

public class Userdao {


	public static  String checkLogin(String email, String password) throws SQLException, 
			ClassNotFoundException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection  con =DriverManager.getConnection("jdbc:mysql://localhost:3306/vaibhav1","root","root");
		Class.forName("com.mysql.jdbc.Driver");
		
		String sql = "SELECT * FROM user WHERE email = ? and password = ?";
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, email);
		statement.setString(2, password);

		ResultSet result = statement.executeQuery();


return null;
		

		

	
	
	}
}
