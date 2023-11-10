package com.parking.lot.management.repository;

import com.parking.lot.management.entity.PriceRate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceRateRepository extends JpaRepository<PriceRate, Integer> {
    PriceRate findByHourlyRate(int hourlyRate);
}
