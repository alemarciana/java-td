package com.alessandra.ninjagoldgame.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.alessandra.ninjagoldgame.models.User;

@Controller
public class HomeController {
	@RequestMapping("/gold")
	public String home(HttpSession session) {
		
		User user = (( session.getAttribute("user") == null ) ? new User() : (User)session.getAttribute("user") );
		
		session.setAttribute("user", user);
		return "views/index.jsp";
	}
	@RequestMapping(value="/farm",method=RequestMethod.POST)
	public String farm(HttpSession session) {
		User user = (( session.getAttribute("user") == null ) ? new User() : (User)session.getAttribute("user") );
		user.goSomewhere("farm");
		session.setAttribute("user", user);
		return "redirect:/gold";
	}
	@RequestMapping(value="/cave",method=RequestMethod.POST)
	public String cave(HttpSession session) {
		User user = (( session.getAttribute("user") == null ) ? new User() : (User)session.getAttribute("user") );
		user.goSomewhere("cave");
		session.setAttribute("user", user);
		return "redirect:/gold";
	}
	@RequestMapping(value="/house",method=RequestMethod.POST)
	public String house(HttpSession session) {
		User user = (( session.getAttribute("user") == null ) ? new User() : (User)session.getAttribute("user") );
		user.goSomewhere("house");
		session.setAttribute("user", user);
		return "redirect:/gold";
	}
	@RequestMapping(value="/casino",method=RequestMethod.POST)
	public String casino(HttpSession session) {
		User user = (( session.getAttribute("user") == null ) ? new User() : (User)session.getAttribute("user") );
		user.goSomewhere("casino");
		session.setAttribute("user", user);
		return "redirect:/gold";
	}
}