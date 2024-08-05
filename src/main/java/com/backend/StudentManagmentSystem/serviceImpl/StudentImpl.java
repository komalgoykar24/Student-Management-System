package com.backend.StudentManagmentSystem.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.StudentManagmentSystem.entity.Student;
import com.backend.StudentManagmentSystem.repostatory.StudentRepo;
import com.backend.StudentManagmentSystem.service.StudentService;

@Service
public class StudentImpl implements StudentService{
    @Autowired
	private StudentRepo studentRepo;
	@Override
	public List<Student> getAllStud() {
		List<Student> list=studentRepo.findAll();
		return list;
	}
	@Override
	public Student saveStudent(Student student) {
		return studentRepo.save(student);
	}
	@Override
	public Student getById(int id) {
		
		return studentRepo.findById(id).get();
	}
	@Override
	public void deleteStudent(int id) {
		
		 studentRepo.deleteById(id);;
	}
	

}
