package com.backend.StudentManagmentSystem.service;

import java.util.List;

import com.backend.StudentManagmentSystem.entity.Student;

public interface StudentService {
public List<Student> getAllStud();
public Student saveStudent(Student student);
public Student getById(int id);
public void deleteStudent(int id);
}
