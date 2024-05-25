package com.kodnest.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.kodnest.entity.Student;
import com.kodnest.service.*;
@RestController
public class Studentcontroller {
	@Autowired
	StudentService stdser;
	@GetMapping(value="/message")
	public String getMessage()
	{
		return "Hello!";
	}
	@GetMapping(value="/student")
	public List<Student> stddetails()
	{
		return stdser.getStudent();
	}

}
