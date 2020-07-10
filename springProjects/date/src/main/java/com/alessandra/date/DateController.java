package com.alessandra.date;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DateController {
	@RequestMapping("")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping("date")
	public String date(Model model) {
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("EEE, MMM d, yyyy");
		model.addAttribute("date", df.format(date));
		return "date.jsp";
	}
	@RequestMapping("time")
	public String time(Model model) {
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("h:mm a");
		model.addAttribute("time", df.format(date));
		return "time.jsp";
	}
}
