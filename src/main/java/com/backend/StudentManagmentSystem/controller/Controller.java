package com.backend.StudentManagmentSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.backend.StudentManagmentSystem.entity.Student;
import com.backend.StudentManagmentSystem.service.StudentService;

@org.springframework.stereotype.Controller
public class Controller {
	@Autowired
	 private StudentService service;
	
	@GetMapping("/home")
	public String home()
	{
		return "home";
	}
	@GetMapping("/student")
	public String getAllStudents(Model model)
	{
		model.addAttribute("students", service.getAllStud());
		return "student";
	}
	
	@GetMapping("student/new")
	public String createsStudentForm(Model model)
	{
		Student student=new Student();
		model.addAttribute("student",student);
		return "createStudent";
	}
     @PostMapping("/student")
	 public String save(@ModelAttribute("student") Student student)
	 {
		 service.saveStudent(student);
		 return "redirect:/student";
	 }
     
     @GetMapping("/student/edit/{id}")
     public String editStudent(@PathVariable("id") int id,Model model)
     { 
    	 model.addAttribute("student", service.getById(id));
    	 return "edit_form";
     }
     
     @PostMapping("/student/edit/{id}")
     public String updateStudent(@PathVariable("id") int id,@ModelAttribute("student") Student student)
     {
    	 Student exitStudent=service.getById(id);
    	 exitStudent.setFirstName(student.getFirstName());
    	 exitStudent.setLastName(student.getLastName());
    	 exitStudent.setEmail(student.getEmail());
    	 service.saveStudent(exitStudent);
    	 return "redirect:/student";
     }
     @GetMapping("/student/{id}")
     public String deleteStudent(@PathVariable("id") int id,Model model)
     {
    	 
    	 service.deleteStudent(id);
    	 return "redirect:/student";

     }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
}
