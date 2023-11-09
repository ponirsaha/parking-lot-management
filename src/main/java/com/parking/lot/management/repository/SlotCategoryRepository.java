package com.parking.lot.management.repository;

import com.parking.lot.management.entity.SlotCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SlotCategoryRepository extends JpaRepository<SlotCategory, Integer> {
}
