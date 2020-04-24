package com.alessandra.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Home() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String favLang = request.getParameter("favoriteLanguage");
		String homeTown = request.getParameter("homeTown");		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.write("<h1>Bienvenido/a "+((firstName == null) ? "Unknown" : firstName)+" "+((lastName == null) ? "Unknown" : lastName)+"</html>");
		out.write("<h2>Tu lenguaje favorito es: "+((favLang == null) ? "Unknown" : favLang)+"</h2>");
		out.write("<h2>Tu ciudad de origen es: "+((homeTown == null) ? "Unknown" : homeTown)+"</h2>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
