package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.studentrepo;
import com.example.demo.student.Student;

@Service
public class servicimplementclass implements serviceclass {

	@Autowired
	studentrepo sturepo;
	
	
	public servicimplementclass(studentrepo sturepo) {
		super();
		this.sturepo = sturepo;
	}

	@Override
	public List<Student> getAllStudents() {
		
		return sturepo.findAll();
	}

	@Override
	public Student getByStudentId(int id) {
		
		return sturepo.findById(id).get();
	}

	@Override
	public Student insertStudent(Student stu) {
		
		return sturepo.save(stu);
	}

	@Override
	public Student updateStudent(Student stu) {
		
		return sturepo.save(stu);
	}

	@Override
	public void deleteStudent(int id) {
		sturepo.deleteById(id);
		
	}

	@Override
	public List<Student> getStuByAge(int age) {
		
		return sturepo.findByAge(age);
	}

	@Override
	public List<Student> getStuByDep(String dep) {
		
		return sturepo.findByDep(dep);
	}

	@Override
	public List<Student> getStuByAgeGreaterNative() {
		
		return sturepo.findByAgeGreaterThenNative();
	}

//	@Override
//	public List<Student> getStuByAgeGreater(int age) {
//		
//		return sturepo.findByAgeGreaterThen(age);
//	}



	

	

}
