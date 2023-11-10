package com.parking.lot.management.service;

import com.parking.lot.management.entity.PriceRate;

import java.util.List;
import java.util.Optional;

public interface PriceRateService {
    PriceRate createPriceRate(PriceRate priceRate);

    PriceRate updatePriceRate(PriceRate priceRate);

    PriceRate deletePriceRate(PriceRate priceRate);

    List<PriceRate> fetchAllPriceRates();

    Optional<PriceRate> getMatchPriceRate(PriceRate priceRate);
}
