package com.lxisoft.byta.clinic.patientServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lxisoft.byta.clinic.model.Patient;
import com.lxisoft.byta.clinic.model.PatientDiagnosis;
import com.lxisoft.byta.clinic.patientService.PatientService;
import com.lxisoft.byta.clinic.repository.PatientDiagnosisRepository;
import com.lxisoft.byta.clinic.repository.PatientRepository;

@Repository
public class PatientServiceIMPL implements PatientService {

	@Autowired
	private PatientRepository repo;
	
	@RequestMapping("/save")
	public void save(Patient p) {
		
		repo.save(p);
	}


	@RequestMapping("/delete")
	public void deleteById(int id) {
		
		repo.delete(id);
		
	}
	
	@RequestMapping("/findById")
	public Patient findById(int id){
		
		return repo.findById(id);
	}
	
	@RequestMapping("/findByName")
	public Patient findByName(String patient)
	{
		
		return repo.findByName(patient);
	}
		
	@RequestMapping("/findAll")
	public Iterable<Patient> findAll()
	{
		
		return repo.findAll();
	}	
	
	@RequestMapping("/update")
	public void update(int id,Patient p)
	{
		
	  repo.save(p);
		
	}


}
