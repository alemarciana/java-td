package com.alessandra.contador;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class CountController {
	@RequestMapping("")
	public String index(HttpSession session) {
		Integer count = (session.getAttribute("count") == null ? 0 : (Integer)session.getAttribute("count"));
		count++;
		session.setAttribute("count", count);
		return "views/index.jsp";
	}
	@RequestMapping("counter")
	public String counter(HttpSession session) {	
		Integer count = (session.getAttribute("count") == null ? 0 : (Integer)session.getAttribute("count"));
		session.setAttribute("count", count);
		return "views/count.jsp";
	}
}
