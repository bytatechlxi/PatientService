package com.bytatech.assets.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bytatech.assets.domain.MaintenanceOperation;

public interface MaintenanceOperationRepository extends JpaRepository<MaintenanceOperation,Integer> {

}
