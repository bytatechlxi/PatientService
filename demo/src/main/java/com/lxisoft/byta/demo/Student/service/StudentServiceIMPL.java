package com.lxisoft.byta.demo.Student.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lxisoft.byta.demo.Student.repo.BookRepo;
import com.lxisoft.byta.demo.Student.repo.StudentRepo;
import com.lxisoft.byta.demo.Student.model.Student;
import com.lxisoft.byta.demo.Student.service.StudentService;
@Service
@Transactional
public class StudentServiceIMPL implements StudentService
{
	@Autowired
	private StudentRepo repo;
	@Autowired
	private BookRepo brepo;
	public void save(Student st)
	{
		//st.setB1(brepo.findById(st.getB1().getId()));
		repo.save(st);
	}
	public Page<Student> findAll(Pageable p)
	{
		Page<Student> sPage=repo.findAll(p);
		
		return sPage;
	}
	public Student findById(int id)
	{

		return repo.findById(id);
	}

	public Student findByLastName(String name)
	{
		return repo.findByLastName(name);
	}

	public ArrayList<Student> findByAgeLessThan(int age)
	{
		return repo.findByAgeLessThan(age);
	}

	public ArrayList<Student> findByFirstNameContaining(String firstName)
	{
		return repo.findByFirstNameContaining(firstName);
	}

	public Student findByLastNameAndFirstName(String lastName, String firstName)
	{
		return repo.findByLastNameAndFirstName(lastName, firstName);
	}

	public void delete(int id)
	{
		repo.delete(id);
	}




}
