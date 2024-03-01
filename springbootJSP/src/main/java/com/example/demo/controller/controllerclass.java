package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.serviceclass;
import com.example.demo.student.Student;

@RestController
@RequestMapping("student")
public class controllerclass {

	serviceclass ser;
	
	
	public controllerclass(serviceclass ser) {
		super();
		this.ser = ser;
	}

	@GetMapping
	public List<Student> getAllStudentdData() {
		return ser.getAllStudents();
		
	}
	
	@GetMapping("/{id}")
	public Student getStudentData(@PathVariable("id") int id) {
		return ser.getByStudentId(id);
		
	}
	
	@PostMapping
	public Student insertStudentData(@RequestBody Student stu) {
		return ser.insertStudent(stu);
	}
	
	@PutMapping
	public Student updateStudentData(@RequestBody Student stu) {
		Student stu1 = ser.getByStudentId(stu.getId());
		if (stu1 != null) {
			return ser.updateStudent(stu);
		}
		return insertStudentData(stu);
	}
	
	@DeleteMapping("/{id}")
	public String deleteStudentData(@PathVariable("id") int id) {
		ser.deleteStudent(id);
		return "Student data deleted Sucessfully";
		
	}
	
	@GetMapping("age/{age}")
	public List<Student> getStudentByAge(@PathVariable("age") int age) {
		return ser.getStuByAge(age);
		
	}
	@GetMapping("native")
	public List<Student> getStudentByAgeGreaterNative() {
		return ser.getStuByAgeGreaterNative();
		 
	}
	
	@GetMapping("dep/{dep}")
	public List<Student> getStudentByDep(@PathVariable("dep") String dep) {
		return ser.getStuByDep(dep);
		
	}
}
