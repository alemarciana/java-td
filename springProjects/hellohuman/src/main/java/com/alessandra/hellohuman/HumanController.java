package com.alessandra.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {
	@RequestMapping("/")
	public String index(@RequestParam(value="name", required = false) String name, @RequestParam(value = "lastName", required = false) String lastName) {
		name = (name == null ? "Human" : name);
		lastName = ( lastName == null ? "Smith" : lastName);
		return "Hello " + name + " " + lastName;
	}
}
