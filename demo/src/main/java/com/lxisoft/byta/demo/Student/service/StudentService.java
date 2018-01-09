package com.lxisoft.byta.demo.Student.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.lxisoft.byta.demo.Student.model.Student;

public interface StudentService {
	
	
	void save(Student st);
	
	Page<Student> findAll(Pageable p);
	
	Student findById(int id);

	Student findByLastName(String name);

	ArrayList<Student> findByAgeLessThan(int age);

	ArrayList<Student> findByFirstNameContaining(String firstNam);

	Student findByLastNameAndFirstName(String lastName, String firstName);

	void delete(int id);
}
