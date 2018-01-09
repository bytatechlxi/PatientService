package com.lxisoft.byta.clinic.patientdto;



import java.util.List;

import com.lxisoft.byta.clinic.model.PatientDiagnosis;

public class PatientDTO {
	
	private int id;
    private String name;
    private String doctor;
    private List<PatientDiagnosis> pd;
   
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDoctor() {
		return doctor;
	}
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}
	public List<PatientDiagnosis> getPd() {
		return pd;
	}
	public void setPd(List<PatientDiagnosis> pd) {
		this.pd = pd;
	}

	
    

}
