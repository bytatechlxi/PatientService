package com.bytatech.assets.service.mapper;

import java.util.ArrayList;

import org.mapstruct.Mapper;

import com.bytatech.assets.domain.MaintenancePlan;
import com.bytatech.assets.service.dto.MaintenancePlanDTO;

@Mapper
public interface MaintenancePlanMapper {

	public MaintenancePlan toEntity(MaintenancePlanDTO dto);
	public MaintenancePlanDTO toDTO(MaintenancePlan mplan);
	public ArrayList<MaintenancePlan> toEntities(ArrayList<MaintenancePlanDTO> dto);
	public ArrayList<MaintenancePlanDTO> toDTOs(ArrayList<MaintenancePlan> mplan);

}
