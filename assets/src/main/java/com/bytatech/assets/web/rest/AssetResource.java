package com.bytatech.assets.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bytatech.assets.service.AssetService;
import com.bytatech.assets.service.dto.AssetDTO;

@RestController
public class AssetResource {

	@Autowired
	private AssetService service;
	
	@RequestMapping("/save")
	public void save(AssetDTO dto) {
		
		service.save(dto);
		
	}
	
}
