package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class Usercontroller {
	@GetMapping
	//with out parameter i.e query parameter
	public String getUser(@RequestParam(value="page") int pg,@RequestParam(value="limit") int lm)
	{
		return "GET api"+pg+" "+lm;
	}
	@GetMapping(path="/{userID}") // withparameter
	public String getUsers(@PathVariable String userID)
	{
		return "GET api for user id : "+userID;
	}
	
	@PostMapping
	public String createUser()
	{
		return "Post api";
	}
	@PutMapping
	public String updateUser()
	{
		return "Put api";
	}
	@DeleteMapping
	public String deleteUser()
	{
		return "Delete api";
	}
	

}
