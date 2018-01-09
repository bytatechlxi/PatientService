package com.lxisoft.byta.clinic.model;



import java.util.Date;

import javax.persistence.*;

@Entity
public class PatientDiagnosis {
	
	@Id
	@GeneratedValue
	private int id;
	private int diagnosisCode;
	private String encounter;
	private Date period;
	
   
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDiagnosisCode() {
		return diagnosisCode;
	}
	public void setDiagnosisCode(int diagnosisCode) {
		this.diagnosisCode = diagnosisCode;
	}
	public String getEncounter() {
		return encounter;
	}
	public void setEncounter(String encounter) {
		this.encounter = encounter;
	}
	
	public Date getPeriod() {
		return period;
	}
	public void setPeriod(Date period) {
		this.period = period;
	}
	
	
	
}