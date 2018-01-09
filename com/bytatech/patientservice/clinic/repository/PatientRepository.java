package com.lxisoft.byta.clinic.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lxisoft.byta.clinic.model.Patient;
import com.lxisoft.byta.clinic.model.PatientDiagnosis;

@Repository
public interface PatientRepository extends  CrudRepository<Patient, Integer> {

    public Patient findById(int id);
	
	public Patient findByName(String patient);

	
}
