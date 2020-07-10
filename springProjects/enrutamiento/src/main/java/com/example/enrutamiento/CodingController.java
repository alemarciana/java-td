package com.example.enrutamiento;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;;

@RestController
@RequestMapping("/coding")
public class CodingController {
	@RequestMapping("")
	public String coding() {
		return "Hello Coding Dojo!";
	}
	@RequestMapping("python")
	public String python() {
		return "Python is great!";
	}
	@RequestMapping("java")
	public String java() {
		return "Java is better!";
	}
}
