package com.alessandra.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.alessandra.web.models.Player;
import com.alessandra.web.models.Roster;
import com.alessandra.web.models.Team;

/**
 * Servlet implementation class Players
 */
@WebServlet("/players")
public class Players extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Players() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/newplayer.jsp");
		HttpSession session = request.getSession();
		Roster roster = (Roster)session.getAttribute("roster");
		Team team = roster.getTeams().get(Integer.parseInt(request.getParameter("id")));
		request.setAttribute("team", team);
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		int id = Integer.parseInt(request.getParameter("id"));
		Roster roster = (Roster)session.getAttribute("roster");
		Team team = roster.getTeams().get(id);
		Player player = new Player(request.getParameter("firstName"), request.getParameter("lastName"), Integer.parseInt(request.getParameter("age")));
		team.addPlayer(player);
		roster.getTeams().set(id, team);
		session.setAttribute("roster", roster);
		response.sendRedirect("teams?id=" + id);
	}

}
