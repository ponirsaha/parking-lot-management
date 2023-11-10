package com.parking.lot.management.controller;

import com.parking.lot.management.entity.PriceRate;
import com.parking.lot.management.service.PriceRateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("price-rate")
public class PriceRateController {

    private final PriceRateService priceRateService;

    @GetMapping("/get-all/{id}")
    public Optional<PriceRate> getSingleSlotCategory(@PathVariable Integer id) {
        return priceRateService.getMatchPriceRate(id);
    }

    @GetMapping("/get-all")
    public List<PriceRate> getAllSlotCategories() {
        return priceRateService.fetchAllPriceRates();
    }

    @PostMapping("/create")
    public PriceRate createSlotCategory(@RequestBody PriceRate priceRate) {
        return priceRateService.createPriceRate(priceRate);
    }

    @PutMapping("/update")
    public PriceRate updateSlotCategory(@RequestBody PriceRate priceRate) {
        return priceRateService.updatePriceRate(priceRate);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteSlotCategory(@PathVariable Integer id) {
        priceRateService.deletePriceRate(id);
    }
}
