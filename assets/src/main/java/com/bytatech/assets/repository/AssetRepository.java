package com.bytatech.assets.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bytatech.assets.domain.Asset;

@org.springframework.stereotype.Repository
public interface AssetRepository extends JpaRepository<Asset,Integer> {
	

}
