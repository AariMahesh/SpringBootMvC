package com.tunehubui.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin("*")
@RestController
public class Callcontroller {
	@GetMapping("/get")
	public String call()
	{
		return "Call controller";
	}

}
