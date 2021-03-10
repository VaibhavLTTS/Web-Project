package com.ltts.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltts.dao.Teamdao;
import com.ltts.model.Team;

/**
 * Servlet implementation class InsertTeam
 */
@WebServlet("/InsertTeam")
public class InsertTeam extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertTeam() {
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
		String teamname=request.getParameter("Teamname");
		int teamId=Integer.parseInt(request.getParameter("teamId"));
		String TeamOwner=request.getParameter("Teamowner");
		String TeamCaptain=request.getParameter("TeamCaptain");
		Team t=new Team(teamname,teamId,TeamOwner,TeamCaptain);
		System.out.println("Inside Servlet: "+t);
		Teamdao td=new Teamdao();
		boolean b=false;
		try {
			
			b=td.insertTeam(t); // Control TRanfers to Dao file
			System.out.println("Successfully Inserted...");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
