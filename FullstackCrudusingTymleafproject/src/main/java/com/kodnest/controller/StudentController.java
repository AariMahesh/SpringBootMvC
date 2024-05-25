package com.kodnest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kodnest.entity.Student;
import com.kodnest.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService ss;
	
	@GetMapping(value="/student")
	public List<Student> getDoc()
	{
		return ss.getStudent();
	}

	@PostMapping(value="/student/insert}")
	public Student postStudent(@RequestBody Student std)
	{
		return ss.insertStudent(std);
	}
	@PutMapping(value="/student/update/{id}")
	public void updateStudent(@PathVariable int id,@RequestBody Student std)
	{
		return ss.updateStudent(id,std);
	}
	@DeleteMapping(value="/student/delete/{id}")
	public void deleteStudent(@PathVariable int id)
	{
		System.out.println("hello");
	}
	

}
