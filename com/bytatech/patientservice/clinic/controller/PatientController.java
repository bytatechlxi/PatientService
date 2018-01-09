package com.lxisoft.byta.clinic.controller;

import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lxisoft.byta.clinic.model.Patient;
import com.lxisoft.byta.clinic.patientMapper.PatientMapper;
import com.lxisoft.byta.clinic.patientService.PatientService;
import com.lxisoft.byta.clinic.patientdto.PatientDTO;

@RestController
public class PatientController {
	
	@Autowired
	private PatientService service;
	
	@Autowired
	private PatientMapper mapper;
	
	@RequestMapping("/save")
	public void save(PatientDTO dto) {
		
		service.save(mapper.toEntity(dto));
	}
	
	@RequestMapping("/deleteById")
	public void deleteById(int id) {
		
		service.deleteById(id);
	}
	
	@RequestMapping("/findById")
	public PatientDTO findById(int id)
	{
		return mapper.toDTO(service.findById(id));
		 
	}
	
	@RequestMapping("/findByName")
	public PatientDTO findByName(String Name)
	{
		
		return mapper.toDTO(service.findByName(Name));
	}
		
	@RequestMapping("/findAll")
	public ArrayList<PatientDTO> findAll()
	{
		
		return mapper.toDTOS(service.findAll());
	}	
	
	@RequestMapping("/update")
	public void update(int id,Patient pd)
	{
		
		service.save(pd);
		
	}

}
