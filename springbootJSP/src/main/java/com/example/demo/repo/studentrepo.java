package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.student.Student;

public interface studentrepo extends JpaRepository<Student, Integer> {

	List<Student> findByAge(int age);
	
	//PAQL -->SQL native query
	@Query(value="Select * from student", nativeQuery= true)
	List<Student> findByAgeGreaterThenNative();
	
	List<Student> findByDep(String dep);
}
