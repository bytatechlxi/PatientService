package com.lxisoft.byta.clinic.model;

import java.util.List;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Patient {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
    private String name;
    private String doctor;
    @OneToMany(cascade = CascadeType.ALL)
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
