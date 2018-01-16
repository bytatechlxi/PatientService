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
	
	public AssetDTO findById(int id) {
		
		return mapper.toDTO(repo.getOne(id));
		
	}
	
	public void delete(int id) {
		
		repo.delete(id);
	}
}
