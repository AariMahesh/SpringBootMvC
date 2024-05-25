package com.kodnest.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodnest.entity.Student;
import com.kodnest.repository.StudentRepository;
@Service
public class StudentService {
	@Autowired
    StudentRepository stre;
	public List<Student> getStudent()
	{
		return stre.findAll();
		
	}
}
