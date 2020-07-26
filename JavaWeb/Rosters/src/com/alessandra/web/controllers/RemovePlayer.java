package com.alessandra.web.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.alessandra.web.models.*;
/**
 * Servlet implementation class RemovePlayer
 */
@WebServlet("/removeplayer")
public class RemovePlayer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RemovePlayer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		int teamId = Integer.parseInt(request.getParameter("teamId"));
		int playerId = Integer.parseInt(request.getParameter("playerId"));
		Roster roster = (Roster)session.getAttribute("roster");
		Team team = roster.getTeams().get(teamId);
		Player player = team.getPlayers().get(playerId);
		team.removePlayer(player);
		roster.getTeams().set(teamId, team);
		response.sendRedirect("teams?id=" + teamId);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
