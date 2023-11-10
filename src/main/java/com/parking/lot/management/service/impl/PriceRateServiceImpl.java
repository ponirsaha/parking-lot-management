package com.parking.lot.management.service.impl;

import com.parking.lot.management.entity.PriceRate;
import com.parking.lot.management.service.PriceRateService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class PriceRateServiceImpl implements PriceRateService {
    @Override
    public PriceRate createPriceRate(PriceRate priceRate) {
        return null;
    }

    @Override
    public PriceRate updatePriceRate(PriceRate priceRate) {
        return null;
    }

    @Override
    public PriceRate deletePriceRate(PriceRate priceRate) {
        return null;
    }

    @Override
    public List<PriceRate> fetchAllPriceRates() {
        return null;
    }

    @Override
    public Optional<PriceRate> getMatchPriceRate(PriceRate priceRate) {
        return Optional.empty();
    }
}
