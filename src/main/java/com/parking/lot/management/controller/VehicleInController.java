package com.parking.lot.management.controller;

import com.parking.lot.management.entity.VehicleIn;
import com.parking.lot.management.service.VehicleInService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("vehicle-in")
public class VehicleInController {

    private final VehicleInService vehicleInService;

    @PostMapping("/create")
    public VehicleIn createSlotPlan(@RequestBody VehicleIn vehicleIn) {
        return vehicleInService.createVehicleIn(vehicleIn);
    }
}
