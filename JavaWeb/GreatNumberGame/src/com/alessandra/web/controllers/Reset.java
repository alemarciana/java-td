package com.alessandra.web.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.alessandra.web.models.User;

/**
 * Servlet implementation class Reset
 */
@WebServlet("/reset")
public class Reset extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Reset() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute("user");
		user.setMinNumber(Integer.parseInt((request.getParameter("min") == null ? "1" : (request.getParameter("min") == "" ? "1" : request.getParameter("min")))));
		user.setMaxNumber(Integer.parseInt((request.getParameter("max") == null ? "100" : ( request.getParameter("max") == "" ? "100" : request.getParameter("max")))));
		user.generateNumber();
		user.setSuccess(-2);
		user.resetTries();
		user.nullifyGuess();
		session.setAttribute("user", user);
		// session.removeAttribute("user");
		response.sendRedirect("game");
	}

}
