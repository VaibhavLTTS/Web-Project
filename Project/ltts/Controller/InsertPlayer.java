package com.ltts.controller;

import java.io.IOException;

import java.sql.Date;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ltts.dao.*;
import com.ltts.model.*;

/**
 * Servlet implementation class InsertPlayer
 */
@WebServlet("/InsertPlayer")
public class InsertPlayer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertPlayer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String pName=request.getParameter("pname");
		String dateOfBirth=request.getParameter("dateOfBirth");
		Date dob=Date.valueOf(dateOfBirth);
		String Skill=request.getParameter("Skill");
		int noOfMatches=Integer.parseInt(request.getParameter("noOfMatches"));
		int runs=Integer.parseInt(request.getParameter("runs"));
		int wickets=Integer.parseInt(request.getParameter("Wickets"));
		String nationality=request.getParameter("nationality");
		int pid=Integer.parseInt(request.getParameter("pid"));
		int teamId=Integer.parseInt(request.getParameter("teamId"));
		Player p=new Player(pName,dob,Skill,noOfMatches,runs,wickets,nationality,pid,teamId);
		System.out.println("Inside Servlet: "+p);
		Playerdao pd=new Playerdao();
		boolean b=false;
		try {
			
			b=pd.insertPlayer(p); // Control TRanfers to Dao file
			System.out.println("Successfully Inserted...");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
		
		
	

private int parseInt(String parameter) {
		// TODO Auto-generated method stub
		return 0;
	}

}
