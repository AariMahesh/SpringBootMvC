package com.kodnest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	public List<Student> getStudent()
	{
		return ss.getStudent();
	}
	@GetMapping(value="/studentbyid/{id}")
	public Student getStudentById(@PathVariable int id)
	{
		return ss.getStudentById(id);
	}
	@PostMapping(value="/student/post")
	public void postStudent(@RequestBody Student student)
	{
		//System.out.println(student);
		ss.postStudent(student);
	}
	@DeleteMapping(value="/student/delete/{id}")
	public void deleteStudent(@PathVariable int id)
	{
		System.out.println(id);
		ss.deleteStudent(id);
	}
	@PutMapping(value="/student/put/{id}")
	public void updateStudent(@PathVariable int id,@RequestBody Student student)
	{
		System.out.println(id);
		System.out.println(student);
		ss.updateStudent(id,student);
	}

}
