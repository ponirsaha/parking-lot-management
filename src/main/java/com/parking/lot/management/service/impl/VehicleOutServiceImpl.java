package com.parking.lot.management.service.impl;

import com.parking.lot.management.entity.VehicleOut;
import com.parking.lot.management.repository.VehicleOutRepository;
import com.parking.lot.management.service.VehicleOutService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class VehicleOutServiceImpl implements VehicleOutService {

    private final VehicleOutRepository vehicleOutRepository;

    @Override
    public VehicleOut createVehicleOut(VehicleOut vehicleOut) {
        return vehicleOutRepository.save(vehicleOut);
    }
}
