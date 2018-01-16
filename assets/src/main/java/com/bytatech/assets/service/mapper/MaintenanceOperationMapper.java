package com.bytatech.assets.service.mapper;

import java.util.ArrayList;

import org.mapstruct.Mapper;

import com.bytatech.assets.domain.MaintenanceOperation;
import com.bytatech.assets.service.dto.MaintenanceOperationDTO;

@Mapper
public interface MaintenanceOperationMapper {

	public MaintenanceOperation toEntity(MaintenanceOperationDTO dto);
	public MaintenanceOperationDTO toDTO(MaintenanceOperation mplan);
	public ArrayList<MaintenanceOperation> toEntities(ArrayList<MaintenanceOperationDTO> dto);
	public ArrayList<MaintenanceOperationDTO> toDTOs(ArrayList<MaintenanceOperation> mplan);

	
}
