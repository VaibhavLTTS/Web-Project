package com.ltts.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ltts.connection.*;
import com.ltts.model.*;

public class Playerdao {

	
	
	
	public List<Player> showPlayer() throws Exception
	{
		List<Player> li=new ArrayList<Player>();
		
		Connection con= DatabaseConnection.getConnection();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from player");
			
			while(rs.next())
			{
				li.add(new Player(rs.getString(1),rs.getDate(2),rs.getString(3),rs.getInt(4),rs.getInt(5),rs.getInt(6),rs.getString(7),rs.getInt(8),rs.getInt(9)));
			}

			return li;
	}
	
	
	public Boolean insertPlayer(Player p) throws Exception
	{		
			Connection con= DatabaseConnection.getConnection();
		
		
			PreparedStatement ps=con.prepareStatement("insert into player values(?,?,?,?,?,?,?,?,?)");
			ps.setString(1,p.getpName());
			ps.setDate(2,p.getDateOfBirth());
			ps.setString(3,p.getSkill());
			ps.setInt(4,p.getNoOfMatches());
			ps.setInt(5,p.getRuns());
			ps.setInt(6,p.getWickets());
			ps.setString(7,p.getNationality());
			ps.setInt(8,p.getPid());
			ps.setInt(9,p.getTeamId());
			boolean i=ps.execute();
			return i;
			}

	public Player getAllPlayerById(int id) throws Exception
	{
		Player p=new Player();
		List<Player> li=new ArrayList<Player>();
		li=showPlayer();
		
		for(Player p1:li)
		{
			if(p1.getPid()==id)
			{
				p.setPid(id);
				p.setpName(p1.getpName());
				p.setNationality(p1.getNationality());
			}
		}
		return p;
	}
	public Boolean updateplayer(int id,String pname,String count) throws Exception
	{
		Connection con= DatabaseConnection.getConnection();
		PreparedStatement ps=con.prepareStatement("UPDATE player SET playername=?,national=? where playerid=?");
		ps.setString(1,pname);
		ps.setString(2, count);
		ps.setInt(3,id);
		Boolean b=ps.execute();
		return b;
	}
}
