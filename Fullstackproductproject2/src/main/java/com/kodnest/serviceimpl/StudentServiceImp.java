package com.kodnest.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import com.kodnest.entity.Student;
import com.kodnest.service.StudentService;
import com.kodnest.repository.*;
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
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		Optional<Student> student=sr.findById(id);
		return student.orElse(null);
	}

	@Override
	public void postStudent(Student student) {
		// TODO Auto-generated method stub
		sr.save(student);
		
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		sr.deleteById(id);
		
	}

	@Override
	public void updateStudent(int id,Student updatestu) {
		// TODO Auto-generated method stub
		Optional<Student> existstud=sr.findById(id);
		if(existstud.isPresent())
		{
			Student std=existstud.get();
			std.setSname(updatestu.getSname());
			sr.save(std);
			System.out.println("update sucess");
		}
		else
		{
			System.out.println("you're trying to update record doesn't exist");
		}
	}

//	@Override
//	public void postStudent(Student student) {
//		// TODO Auto-generated method stub
//		sr.save(student);
//	}

}
