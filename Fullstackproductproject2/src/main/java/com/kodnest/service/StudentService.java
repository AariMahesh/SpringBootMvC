package com.kodnest.service;

import java.util.List;
import com.kodnest.entity.*;

public interface StudentService {
	List<Student> getStudent();

	Student getStudentById(int id);

	void postStudent(Student student);

	void deleteStudent(int id);

	void updateStudent(int id,Student student);

	//void postStudent(Student student);

	

}
