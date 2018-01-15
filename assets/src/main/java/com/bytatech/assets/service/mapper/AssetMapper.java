package com.bytatech.assets.service.mapper;

import java.util.ArrayList;

import org.mapstruct.Mapper;

import com.bytatech.assets.domain.Asset;
import com.bytatech.assets.service.dto.AssetDTO;

@Mapper(componentModel="spring")
public interface AssetMapper {
	
public Asset toEntity(AssetDTO dto);
public AssetDTO toDTO(Asset asset);
public ArrayList<Asset> toEntities(ArrayList<AssetDTO> dto);
public ArrayList<AssetDTO> toDTOs(ArrayList<Asset> asset);

}
