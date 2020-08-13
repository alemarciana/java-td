package com.alessandra.survey.controllers;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "views/index.jsp";
	}
	@RequestMapping(value="/result", method=RequestMethod.POST)
	public String result(@RequestParam(value="name") String name,
			@RequestParam(value="location") String location,
			@RequestParam(value="language") String lang,
			@RequestParam(value="comment") String comment,
			Model model
			) {
		ArrayList<String> attributes = new ArrayList<String>();
		attributes.add(name);attributes.add(location);
		attributes.add(lang);attributes.add(comment);
		model.addAllAttributes(attributes);
		model.addAttribute("name",name);model.addAttribute("location", location);
		model.addAttribute("language", lang);model.addAttribute("comment", comment);
		return "views/result.jsp";
	}
}
