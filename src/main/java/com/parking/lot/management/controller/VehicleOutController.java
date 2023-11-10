package com.parking.lot.management.controller;

import com.parking.lot.management.entity.VehicleOut;
import com.parking.lot.management.service.VehicleOutService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("vehicle-out")
public class VehicleOutController {

    private final VehicleOutService vehicleOutService;

    @PostMapping("/create")
    public VehicleOut createSlotPlan(@RequestBody VehicleOut vehicleOut) {
        return vehicleOutService.createVehicleOut(vehicleOut);
    }
}
