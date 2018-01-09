package com.lxisoft.byta.demo.Student.mapper;
import java.util.ArrayList;
import java.util.List;

import org.mapstruct.Mapper;

import com.lxisoft.byta.demo.Student.model.Student;
import com.lxisoft.byta.demo.Student.model.StudentDTO;
@Mapper(componentModel="spring")
public interface StudentMapper 
{
	Student toEntity(StudentDTO sdto);
	StudentDTO toDTO(Student student);
	ArrayList<Student> toEntities(ArrayList<StudentDTO> sdtoList);
	ArrayList<StudentDTO> toDTOs(List<Student> studentList);


}
