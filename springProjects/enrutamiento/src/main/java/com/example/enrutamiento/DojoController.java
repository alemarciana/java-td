package com.example.enrutamiento;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DojoController {
	@RequestMapping("{dojo}")
	public String dojo(@PathVariable("dojo") String path) {
		if (path.equals("dojo")) {
			return "The Dojo is awesome!";
		}
		else if(path.equals("burbank-dojo")) {
			return "Burbank Dojo is localized at South California";
		}
		else if(path.contentEquals("san-jose")) {
			return "San Jose Dojo is the headquarter";
		}
		else {
			return "woah";
		}
	}
}
