package com.parking.lot.management.repository;

import com.parking.lot.management.entity.SlotPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SlotPlanRepository extends JpaRepository<SlotPlan, Integer> {
}
