package com.lxisoft.byta.demo.Student.model;

import java.util.List;

public class StudentDTO {
private String firstName,lastName,place;
List<Book> b1;

public List<Book> getB1() {
	return b1;
}
public void setB1(List<Book> b1) {
	this.b1 = b1;
}
public String getPlace() {
	return place;
}
public void setPlace(String place) {
	this.place = place;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
private int id;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
	
private int age;
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

}
