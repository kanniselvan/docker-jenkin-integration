package com.kanni.springboot.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	@GetMapping
	public String getMessage() {
		return "Welcome to springboot with docker";
		
	}
	@GetMapping("/message")
	public String welcome() {
		return "Welcome to springboot with docker and Jenkin";
		
	}

}
