package com.lxisoft.byta.clinic.patientService;

import org.springframework.stereotype.Repository;

import com.lxisoft.byta.clinic.model.Patient;
import com.lxisoft.byta.clinic.patientdto.PatientDTO;

@Repository
public interface PatientService {

	    public void save(Patient p);
		
		public void deleteById(int id);
		
		public Patient findById(int id);
		
		public Patient findByName(String patient);
		
		public Iterable<Patient> findAll();
		
		public void update(int id,Patient p);
		

}
