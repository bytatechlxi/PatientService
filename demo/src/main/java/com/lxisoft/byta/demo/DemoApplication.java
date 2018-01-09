package com.lxisoft.byta.demo;
import com.lxisoft.byta.demo.Student.controller.StudentController;
import com.lxisoft.byta.demo.Student.model.*;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.repository.CrudRepository;

@SpringBootApplication
public class DemoApplication //implements CommandLineRunner
{
	static Logger logger=Logger.getLogger(StudentController.class.getName());
	
	
	static int[] a=new int[10];
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		System.out.println(a[0]);
		logger.error("Errorrrr");

				
	}
/*
	@Override
	public void run(String... arg0) throws Exception {
		createStudent();
		
	}
	private void createStudent(){
		Student s=new Student();
		s.setId(3);
		s.setName("helllooooo");
		ss.create(s);
	}*/
}
                        