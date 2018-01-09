package com.lxisoft.byta.demo.Student.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lxisoft.byta.demo.Student.repo.BookRepo;
import com.lxisoft.byta.demo.Student.repo.StudentRepo;
import com.lxisoft.byta.demo.Student.mapper.StudentMapper;
import com.lxisoft.byta.demo.Student.model.Student;
import com.lxisoft.byta.demo.Student.model.StudentDTO;
import com.lxisoft.byta.demo.Student.service.StudentService;



@RestController
public class StudentController {
	@Autowired
	private StudentService service;
	@Autowired
	private StudentMapper mapper;
	@Autowired
	private BookRepo brepo;
	Logger log=Logger.getLogger(StudentController.class);
	/*@RequestMapping("/get")
	public Student getStudent(@RequestParam int id)
	{
		return null;
	}
	@RequestMapping("/student")
	public void postStudent(String s)
	{
		System.out.println("hahahahahahaha");
	}*/
	
	@RequestMapping("/save")
	public String save(StudentDTO sdto)
	{
		Student st=mapper.toEntity(sdto);
		service.save(st);
		return "successfull";

	}
	@RequestMapping("/findall")
	public Page<Student> findAll(Pageable p)
	{
		log.info("Found data");
		Page<Student> sPage=service.findAll(p);
		return sPage;
	//	List<Student> studentList=sPage.getContent();
//	    List<StudentDTO> patientDTOList=mapper.toDTOs(studentList);
		//return patientDTOList;
	
	}
	@RequestMapping("/findbyid")
	public StudentDTO findById(int id)
	{
		Student stp=service.findById(id);
		if(stp!=null)
		{
		StudentDTO sdto=mapper.toDTO(stp);	
			return sdto;
		}
		else
		{
			return null;
		}
	
	}
	@RequestMapping("/findbylastname")
	public Student findByLastName(String lastName)
	{
		Student stp=service.findByLastName(lastName);
		return stp;
	}
	@RequestMapping("/findByAgeLessThan")
	public ArrayList<Student> findByAgeLessThan(int age)
	{
	return service.findByAgeLessThan(age);
		}
	
	@RequestMapping("/findByFirstNameContaining")
	public ArrayList<Student> findByFirstNameContaining(String firstName)
	{
	return service.findByFirstNameContaining(firstName);
	}
	
	@RequestMapping("/findByLastnameAndFirstname")
	public String findByLastNameAndFirstName(String lastName,String firstName)
	{
	Student st=service.findByLastNameAndFirstName(lastName,firstName);
	if(st==null)
	{
	return "lost it";
	}
	else{
		return "got it";
	}
	}
	
	@RequestMapping("/update")
	public Student update(Student st)
	{
		Student stp=service.findById(st.getId());
		if(stp==null)
		{
			return null;
		}
		else
		{
			service.save(st);
			return st;
		}

	}
	@RequestMapping("/delete")
	public String delete(int id)
	{
		Student stp=service.findById(id);
		if(stp!=null)
		{
			service.delete(id);;
			return "successful";
		}
		else
		{
			return "unsuccessfull";
		}
	}
}
