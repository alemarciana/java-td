package com.alessandra.date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DateController {
	public String index() {
		return "index.jsp";
	}
	public String date() {
		return "date.jsp";
	}
	public String time() {
		return "time.jsp";
	}
}
