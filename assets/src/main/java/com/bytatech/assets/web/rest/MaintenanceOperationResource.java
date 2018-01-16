package com.bytatech.assets.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.bytatech.assets.service.MaintenanceOperationService;
import com.bytatech.assets.service.dto.MaintenanceOperationDTO;

@RestController
public class MaintenanceOperationResource {

	@Autowired
	private MaintenanceOperationService service;
	
	public void save(MaintenanceOperationDTO dto) {
		
		service.save(dto);
	}
}
