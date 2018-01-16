package com.bytatech.assets.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bytatech.assets.repository.MaintenanceOperationRepository;
import com.bytatech.assets.service.dto.MaintenanceOperationDTO;
import com.bytatech.assets.service.mapper.MaintenanceOperationMapper;

@Service
public class MaintenanceOperationServiceIMPL {
	
	@Autowired
	private MaintenanceOperationMapper mapper;
	
	@Autowired
	private MaintenanceOperationRepository repo;
	
	public void save(MaintenanceOperationDTO dto) {
		
		repo.save(mapper.toEntity(dto));
		
	}
	
	

}
