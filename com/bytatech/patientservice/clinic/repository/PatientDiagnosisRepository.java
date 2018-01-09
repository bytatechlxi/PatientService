package com.lxisoft.byta.clinic.repository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.lxisoft.byta.clinic.model.PatientDiagnosis;

@Repository
public interface PatientDiagnosisRepository extends  CrudRepository<PatientDiagnosis, Integer> {

    public PatientDiagnosis findById(int id);
	
	
}
