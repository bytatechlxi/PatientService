package com.lxisoft.byta.clinic.patientMapper;

import java.util.ArrayList;

import org.mapstruct.Mapper;

import com.lxisoft.byta.clinic.model.Patient;
import com.lxisoft.byta.clinic.patientdto.PatientDTO;

@Mapper(componentModel = "spring")
public interface PatientMapper {

	    public Patient toEntity(PatientDTO pdto);
		
		public ArrayList<Patient> toEntities(ArrayList<PatientDTO> dto);
		
		public PatientDTO toDTO(Patient p);
		
		public ArrayList<PatientDTO> toDTOS(Iterable<Patient> iterable); 

}
