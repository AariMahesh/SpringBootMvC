package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
	@GetMapping("/link")
	public String connect()
	{
		return "Display";
	}

}
