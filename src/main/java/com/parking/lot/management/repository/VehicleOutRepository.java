package com.parking.lot.management.repository;

import com.parking.lot.management.entity.VehicleOut;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleOutRepository extends JpaRepository<VehicleOut, Integer> {
}
