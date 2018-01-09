package com.lxisoft.byta.demo.Student.repo;
import com.lxisoft.byta.demo.Student.model.*;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> 
{

	Student findById(int id);

	Student findByLastName(String name);

	ArrayList<Student> findByAgeLessThan(int age);

	ArrayList<Student> findByFirstNameContaining(String firstNam);

	Student findByLastNameAndFirstName(String lastName, String firstName);
	

    
}