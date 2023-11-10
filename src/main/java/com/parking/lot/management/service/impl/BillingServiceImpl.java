package com.parking.lot.management.service.impl;

import com.parking.lot.management.entity.*;
import com.parking.lot.management.enums.Status;
import com.parking.lot.management.repository.*;
import com.parking.lot.management.service.BillingService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class BillingServiceImpl implements BillingService {
    private final BillingRepository billingRepository;
    private final VehicleInRepository vehicleInRepository;
    private final VehicleOutRepository vehicleOutRepository;
    private final SlotPlanRepository slotPlanRepository;
    private final PriceRateRepository priceRateRepository;

    @Override
    public Billing createBilling(String vehicleNo) {
        VehicleReservation vehicleReservation = vehicleInRepository.findByVehicleNo(vehicleNo);
        VehicleOut vehicleOut = vehicleOutRepository.findByVehicleReservation(vehicleReservation);
        SlotPlan slotPlan = slotPlanRepository.findById(vehicleReservation.getSlotPlan().getId())
                .orElseThrow(RuntimeException::new);
        vehicleReservation.setSlotPlan(slotPlan);
        slotPlan.setStatus(Status.READY);
        slotPlanRepository.save(slotPlan);
        Billing billing = new Billing();
        billing.setSlotPlan(slotPlan);
        billing.setVehicleReservation(vehicleReservation);
        billing.setVehicleOut(vehicleOut);
        return billingRepository.save(billing);
    }

}
