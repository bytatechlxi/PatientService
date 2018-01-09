package com.lxisoft.byta.demo.Student.model;

import java.util.List;

import javax.persistence.*;

@Entity

public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	/*private List<Student> st;
	public List<Student> getSt() {
		return st;
	}
	public void setSt(List<Student> st) {
		this.st = st;
	}*/
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
