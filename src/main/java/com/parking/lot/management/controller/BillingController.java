package com.parking.lot.management.controller;

import com.parking.lot.management.entity.Billing;
import com.parking.lot.management.service.BillingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("billing")
public class BillingController {

    private final BillingService billingService;

    @PostMapping("/create")
    public Billing createBilling(@RequestBody Billing billing) {
        return billingService.createBilling(billing);
    }
}
