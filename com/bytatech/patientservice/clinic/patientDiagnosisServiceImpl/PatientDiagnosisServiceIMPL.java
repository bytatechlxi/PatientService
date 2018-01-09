package com.lxisoft.byta.clinic.patientDiagnosisServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lxisoft.byta.clinic.model.PatientDiagnosis;
import com.lxisoft.byta.clinic.patientDiagnosisService.PatientDiagnosisService;
import com.lxisoft.byta.clinic.repository.PatientDiagnosisRepository;

@Repository
public class PatientDiagnosisServiceIMPL implements  PatientDiagnosisService{

	
	@Autowired
	private PatientDiagnosisRepository repo;
	
	
	@RequestMapping("/save")
	public void save(PatientDiagnosis pdr) {
		
		repo.save(pdr);
	}


	@RequestMapping("/delete")
	public void deleteById(int id) {
		
		repo.delete(id);
		
	}
	
	@RequestMapping("/findById")
	public PatientDiagnosis findById(int id){
		
		return repo.findById(id);
	}
		
	@RequestMapping("/findAll")
	public Iterable<PatientDiagnosis> findAll()
	{
		
		return repo.findAll();
	}	
	
	@RequestMapping("/update")
	public void update(int id,PatientDiagnosis pd)
	{
		
	  repo.save(pd);
		
	}

}
