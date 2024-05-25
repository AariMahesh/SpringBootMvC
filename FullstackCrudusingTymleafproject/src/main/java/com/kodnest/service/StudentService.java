package com.kodnest.service;

import java.util.List;

import com.kodnest.entity.Student;

public interface StudentService {

	List<Student> getStudent();

	

	Student insertStudent(Student std);



	Object updateStudent(int id, Student std);

}
