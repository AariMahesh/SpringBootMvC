package com.kodnest.project1.controller;
import org.springframework.web.bind.annotation.*;
@RestController
public class Demo {
	@GetMapping(value="/greet")
	public String display()
	{
		return "hello..>?><>!";
	}

}
