package com.parking.lot.management.service.impl;

import com.parking.lot.management.entity.SlotPlan;
import com.parking.lot.management.entity.VehicleReservation;
import com.parking.lot.management.enums.Status;
import com.parking.lot.management.repository.SlotPlanRepository;
import com.parking.lot.management.repository.VehicleInRepository;
import com.parking.lot.management.service.VehicleInService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Date;

@Slf4j
@Service
@RequiredArgsConstructor
public class VehicleInServiceImpl implements VehicleInService {

    private final VehicleInRepository vehicleInRepository;
    private final SlotPlanRepository slotPlanRepository;

    @Override
    public VehicleReservation createVehicleIn(VehicleReservation vehicleReservation) {
        vehicleReservation.setLotInTime(new Date());
        System.out.println(vehicleReservation.getSlotPlan().getId());
        SlotPlan slotPlan = slotPlanRepository.findById(vehicleReservation.getSlotPlan().getId())
                .orElseThrow(RuntimeException::new);
        vehicleReservation.setSlotPlan(slotPlan);
        slotPlan.setStatus(Status.IN_USE);
        slotPlanRepository.save(slotPlan);
        return vehicleInRepository.save(vehicleReservation);
    }
}
