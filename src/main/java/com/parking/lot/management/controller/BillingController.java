package com.parking.lot.management.controller;

import com.parking.lot.management.entity.Billing;
import com.parking.lot.management.service.BillingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("billing")
public class BillingController {

    private final BillingService billingService;

    @PostMapping("/create")
    public Billing createBilling(@RequestParam String vehicleNo) {
        return billingService.createBilling(vehicleNo);
    }
}
