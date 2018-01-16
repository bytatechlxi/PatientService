package com.bytatech.assets.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bytatech.assets.repository.MaintenancePlanRepository;
import com.bytatech.assets.service.MaintenancePlanService;
import com.bytatech.assets.service.dto.MaintenancePlanDTO;
import com.bytatech.assets.service.mapper.MaintenancePlanMapper;

@Service
public class MaintenancePlanServiceIMPL implements MaintenancePlanService {

	@Autowired
	private MaintenancePlanRepository repo;
	
	@Autowired
	private MaintenancePlanMapper mapper;
	
	
	public void save(MaintenancePlanDTO dto) {
	
		repo.save(mapper.toEntity(dto));
	}


	
	public MaintenancePlanDTO findById(int id) {
		
		return mapper.toDTO(repo.getOne(id));
	}



	
	public void delete(int id) {
	
		repo.delete(id);
		
	}

	
}
