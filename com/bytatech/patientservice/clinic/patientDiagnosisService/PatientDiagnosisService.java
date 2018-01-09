package com.lxisoft.byta.clinic.patientDiagnosisService;

import org.springframework.stereotype.Repository;

import com.lxisoft.byta.clinic.model.PatientDiagnosis;

@Repository
public interface PatientDiagnosisService {

    public void save(PatientDiagnosis pd);
	
	public void deleteById(int id);
	
	public PatientDiagnosis findById(int id);
	
	public Iterable<PatientDiagnosis> findAll();
	
	public void update(int id,PatientDiagnosis pd);
	
	
}
