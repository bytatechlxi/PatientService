package com.bytatech.assets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bytatech.assets.domain.MaintenancePlan;

@Repository
public interface MaintenancePlanRepository extends JpaRepository<MaintenancePlan,Integer> {

}
