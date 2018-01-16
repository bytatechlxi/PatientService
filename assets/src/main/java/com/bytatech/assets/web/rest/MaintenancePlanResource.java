package com.bytatech.assets.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bytatech.assets.service.MaintenancePlanService;
import com.bytatech.assets.service.dto.AssetDTO;
import com.bytatech.assets.service.dto.MaintenancePlanDTO;

@RestController
public class MaintenancePlanResource {

	@Autowired
	private MaintenancePlanService service;
	
	@RequestMapping("/save")
	public void save(MaintenancePlanDTO dto) {
		
	service.save(dto);
		
	}
	
	@RequestMapping("/find")
	public MaintenancePlanDTO findById(int id) {
		
		return service.findById(id);
		
	}
	
	@RequestMapping("/clear")
	public void delete(int id) {
		
		service.delete(id);
		
	}
}
