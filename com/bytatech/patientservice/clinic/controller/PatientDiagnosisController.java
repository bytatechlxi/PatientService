package com.lxisoft.byta.clinic.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lxisoft.byta.clinic.model.PatientDiagnosis;
import com.lxisoft.byta.clinic.patientDiagnosisDTO.PatientDiagnosisDTO;
import com.lxisoft.byta.clinic.patientDiagnosisMapper.PatientDiagnosisMapper;
import com.lxisoft.byta.clinic.patientDiagnosisService.PatientDiagnosisService;


@RestController
public class PatientDiagnosisController {

	
	@Autowired
	private PatientDiagnosisService service;
	
	@Autowired
	private PatientDiagnosisMapper mapper;

	
	@RequestMapping("/savepd")
	public void save(PatientDiagnosisDTO dto) {
		
		service.save(mapper.toEntity(dto));
	}
	
	@RequestMapping("/deleteByIdpd")
	public void deleteById(int id) {
		
		service.deleteById(id);
	
	}
	@RequestMapping("/findByIdpd")
	public PatientDiagnosisDTO findById(int id)
	{
		return mapper.toDTO(service.findById(id));
		 
	}
	
		
	@RequestMapping("/findAllpd")
	public ArrayList<PatientDiagnosisDTO> findAll()
	{
		
		return mapper.toDTOS(service.findAll());
	}	
	
	@RequestMapping("/updatepd")
	public void update(int id,PatientDiagnosis pd)
	{
		
	  service.save(pd);
		
	}
		
	
}
