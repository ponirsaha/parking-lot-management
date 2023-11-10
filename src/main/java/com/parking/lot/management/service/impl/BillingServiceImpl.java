package com.parking.lot.management.service.impl;

import com.parking.lot.management.entity.Billing;
import com.parking.lot.management.repository.BillingRepository;
import com.parking.lot.management.service.BillingService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class BillingServiceImpl implements BillingService {
    private final BillingRepository billingRepository;

    @Override
    public Billing createBilling(Billing billing) {
        return billingRepository.save(billing);
    }
}
