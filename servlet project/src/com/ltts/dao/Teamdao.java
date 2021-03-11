package com.ltts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ltts.connection.*;
import com.ltts.model.Player;
import com.ltts.model.Team;


public class Teamdao {
	
	
	public List<Team> showTeam() throws Exception
	{
		List<Team> li=new ArrayList<Team>();
		Connection con= DatabaseConnection.getConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from team");

		while(rs.next())
		{
			li.add(new Team(rs.getString(1),rs.getInt(2),rs.getString(3),rs.getString(4)));
		}
		return li;
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