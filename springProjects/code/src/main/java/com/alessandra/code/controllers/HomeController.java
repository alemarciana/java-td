package com.alessandra.code.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home() {
		return "views/index.jsp";
	}
	@RequestMapping(value="/code", method=RequestMethod.POST)
	public String secret(@RequestParam(value = "code") String code) {
		if ( code.equals("bushido")) {
			return "views/secret.jsp";
		}
		else {	
			return "redirect:/invalidCode";
		}
	}
	@RequestMapping("/invalidCode")
	public String invalidCode(RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("error", "You must train harder!");
		return "redirect:/";
	}
}
