package com.ltts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.Statement;

import com.ltts.connection.*;
import com.ltts.model.Team;


public class Teamdao {
	
	
	public void showTeam() throws Exception
	{
		
		Connection con= DatabaseConnection.getConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from team");
		System.out.println("TeamName\tTeamOwner\tTeamID\tTeamCaptain");

		while(rs.next())
		{
			System.out.println(rs.getString(1)+"\t"+rs.getInt(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
		}
con.close();
		
	}
	
	public Boolean insertTeam(Team t) throws Exception
	{
		Connection con= DatabaseConnection.getConnection();
	
		PreparedStatement ps=con.prepareStatement("insert into team values(?,?,?,?)");
		ps.setString(1,t.getTeamName());
		ps.setInt(2,t.getTeamId());
		ps.setString(3,t.getTeamOwner());
		ps.setString(4,t.getTeamCaptain());
		boolean i=ps.execute();
		return i;
	}
}
