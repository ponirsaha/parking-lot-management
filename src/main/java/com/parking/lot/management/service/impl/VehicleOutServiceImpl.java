package com.parking.lot.management.service.impl;

import com.parking.lot.management.entity.VehicleReservation;
import com.parking.lot.management.entity.VehicleOut;
import com.parking.lot.management.repository.SlotPlanRepository;
import com.parking.lot.management.repository.VehicleInRepository;
import com.parking.lot.management.repository.VehicleOutRepository;
import com.parking.lot.management.service.VehicleOutService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Date;

@Slf4j
@Service
@RequiredArgsConstructor
public class VehicleOutServiceImpl implements VehicleOutService {

    private final VehicleOutRepository vehicleOutRepository;
    private final VehicleInRepository vehicleInRepository;
    private final SlotPlanRepository slotPlanRepository;

    @Override
    public VehicleOut createVehicleOut(String vehicleNo) {
        VehicleOut vehicleOut = new VehicleOut();
        VehicleReservation vehicleReservation = vehicleInRepository.findByVehicleNo(vehicleNo);
        vehicleOut.setVehicleOutTime(new Date());
        vehicleOut.setVehicleReservation(vehicleReservation);
        return vehicleOutRepository.save(vehicleOut);
    }
}
