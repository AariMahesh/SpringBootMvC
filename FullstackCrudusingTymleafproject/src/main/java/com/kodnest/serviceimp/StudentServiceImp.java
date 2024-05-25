package com.kodnest.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodnest.entity.Student;
import com.kodnest.repository.StudentRepository;
import com.kodnest.service.StudentService;
@Service
public class StudentServiceImp implements StudentService {
	@Autowired
	StudentRepository sr;

	@Override
	public List<Student> getStudent() {
		// TODO Auto-generated method stub
		return sr.findAll();
	}

	

	@Override
	public Student insertStudent(Student std) {
		// TODO Auto-generated method stub
		return sr.save(std);
	}



	@Override
	public Object updateStudent(int id, Student std) {
		// TODO Auto-generated method stub
		return null;
	}

}
