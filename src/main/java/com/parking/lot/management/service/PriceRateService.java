package com.parking.lot.management.service;

import com.parking.lot.management.entity.PriceRate;

import java.util.List;
import java.util.Optional;

public interface PriceRateService {
    PriceRate createPriceRate(PriceRate priceRate);

    PriceRate updatePriceRate(PriceRate priceRate);

    void deletePriceRate(Integer id);

    List<PriceRate> fetchAllPriceRates();

    Optional<PriceRate> getMatchPriceRate(Integer id);
}
