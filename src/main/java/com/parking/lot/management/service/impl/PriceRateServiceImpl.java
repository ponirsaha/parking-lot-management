package com.parking.lot.management.service.impl;

import com.parking.lot.management.entity.PriceRate;
import com.parking.lot.management.repository.PriceRateRepository;
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

    private final PriceRateRepository priceRateRepository;

    @Override
    public PriceRate createPriceRate(PriceRate priceRate) {
        return priceRateRepository.save(priceRate);
    }

    @Override
    public PriceRate updatePriceRate(PriceRate priceRate) {
        return priceRateRepository.save(priceRate);
    }

    @Override
    public void deletePriceRate(Integer id) {
        priceRateRepository.deleteById(id);
    }

    @Override
    public List<PriceRate> fetchAllPriceRates() {
        return priceRateRepository.findAll();
    }

    @Override
    public Optional<PriceRate> getMatchPriceRate(Integer id) {
        return priceRateRepository.findById(id);
    }
}
