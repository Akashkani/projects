package com.example.demo.service;

import java.util.List;

import com.example.demo.student.Student;

public interface serviceclass {

	List<Student> getAllStudents();
	
	
	Student getByStudentId(int id);


	Student insertStudent(Student stu);


	Student updateStudent(Student stu);


	void deleteStudent(int id);


	List<Student> getStuByAge(int age);


	List<Student> getStuByDep(String dep);


	List<Student> getStuByAgeGreaterNative();


//	List<Student> getStuByAgeGreater(int age);





	


	


	 
}
