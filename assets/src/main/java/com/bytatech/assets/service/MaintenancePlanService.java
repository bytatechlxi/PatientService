package com.bytatech.assets.service;

import com.bytatech.assets.service.dto.MaintenancePlanDTO;

public interface MaintenancePlanService {
	
	public void save(MaintenancePlanDTO dto);

	public MaintenancePlanDTO findById(int id);
	
	public void delete(int id);

}
