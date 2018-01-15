package com.bytatech.assets.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bytatech.assets.repository.AssetRepository;
import com.bytatech.assets.service.AssetService;
import com.bytatech.assets.service.dto.AssetDTO;
import com.bytatech.assets.service.mapper.AssetMapper;

@Service
public class AssetsServiceIMPL implements AssetService {

	@Autowired
	private AssetMapper mapper;
	
	@Autowired
	private AssetRepository repo;
	
	public void save(AssetDTO dto) {
		
	repo.save(mapper.toEntity(dto));
		
	}
}
