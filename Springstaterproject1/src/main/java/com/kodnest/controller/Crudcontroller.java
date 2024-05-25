package com.kodnest.controller;
import org.springframework.web.bind.annotation.*;
import com.kodnest.entity.*;
@RestController
public class Crudcontroller {
	@GetMapping(value="/greet")
	public String greet()
	{
		return "hello.....!";
	}
	@GetMapping(value="/greet1")
	public int greet1()
	{
		return 100;
	}
	@GetMapping(value="/greet2")
	public float greet2()
	{
		return 100.0f;
	}
	@GetMapping(value="/greet3")
	public Student greet3()
	{
		return new Student("Mahesh",23);
	}
	@GetMapping(value="/empdetails")
	public Employee empDetails()
	{
		return new Employee(1,"Mahesh",23000);
	}

}
