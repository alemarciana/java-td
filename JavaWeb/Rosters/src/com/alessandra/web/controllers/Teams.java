package com.alessandra.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.alessandra.web.models.Roster;
import com.alessandra.web.models.Team;

/**
 * Servlet implementation class Teams
 */
@WebServlet("/teams")
public class Teams extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Teams() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getParameter("id") != null) {
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/teaminfo.jsp");
			HttpSession session = request.getSession();
			Roster roster = (Roster)session.getAttribute("roster");
			Team team = roster.getTeams().get(Integer.parseInt(request.getParameter("id")));
			request.setAttribute("team", team);
			view.forward(request, response);
		}
		else {
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/newteam2.jsp");
			view.forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Roster roster = (Roster)session.getAttribute("roster");
		String name = request.getParameter("name");
		Team team = new Team(name);
		roster.addTeam(team);
		session.setAttribute("roster", roster);
		response.sendRedirect("home");
	}

}
