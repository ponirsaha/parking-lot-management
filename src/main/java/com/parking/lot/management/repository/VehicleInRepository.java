package com.parking.lot.management.repository;

import com.parking.lot.management.entity.VehicleReservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleInRepository extends JpaRepository<VehicleReservation, Integer> {

    VehicleReservation findByVehicleNo(String vehicleNo);
}
