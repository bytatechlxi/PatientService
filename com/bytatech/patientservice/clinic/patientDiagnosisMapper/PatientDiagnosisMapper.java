package com.lxisoft.byta.clinic.patientDiagnosisMapper;

import java.util.ArrayList;

import org.mapstruct.Mapper;

import com.lxisoft.byta.clinic.model.PatientDiagnosis;
import com.lxisoft.byta.clinic.patientDiagnosisDTO.PatientDiagnosisDTO;

@Mapper(componentModel = "spring")
public interface PatientDiagnosisMapper {

    public PatientDiagnosis toEntity(PatientDiagnosisDTO pd);
	
	public ArrayList<PatientDiagnosis> toEntities(ArrayList<PatientDiagnosisDTO> dto);
	
	public PatientDiagnosisDTO toDTO(PatientDiagnosis pd);
	
	public ArrayList<PatientDiagnosisDTO> toDTOS(Iterable<PatientDiagnosis> iterable); 

}
