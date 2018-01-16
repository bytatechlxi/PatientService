package com.bytatech.assets.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bytatech.assets.domain.Asset;
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
	
	@RequestMapping("/find")
	public AssetDTO findById(int id) {
		
		return service.findById(id);
		
	}
	
	@RequestMapping("/clear")
	public void delete(int id) {
		
		service.delete(id);
		
	}
	
}
