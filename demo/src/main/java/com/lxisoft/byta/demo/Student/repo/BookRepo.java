package com.lxisoft.byta.demo.Student.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lxisoft.byta.demo.Student.model.Book;

public interface BookRepo extends JpaRepository<Book,Integer>{
	Book findById(int id);

}
