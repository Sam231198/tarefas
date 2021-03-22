package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Task {

	@RequestMapping
	public String index() {
		return "Hello, Word!";
	}
	
}
