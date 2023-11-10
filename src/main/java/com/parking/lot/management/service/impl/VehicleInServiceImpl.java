package com.parking.lot.management.service.impl;

import com.parking.lot.management.entity.VehicleIn;
import com.parking.lot.management.repository.VehicleInRepository;
import com.parking.lot.management.service.VehicleInService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class VehicleInServiceImpl implements VehicleInService {

    private final VehicleInRepository vehicleInRepository;

    @Override
    public VehicleIn createVehicleIn(VehicleIn vehicleIn) {
        return vehicleInRepository.save(vehicleIn);
    }
}
