package com.subbu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubbuCaseStudyController {

	@GetMapping("/message")
	public String getMessage() {
		return "Welcome to Subramanyam Vemala - message - call through the REST API";
	}
}
