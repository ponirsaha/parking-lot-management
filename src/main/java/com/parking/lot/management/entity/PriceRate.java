package com.parking.lot.management.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "PRICE_RATE")
public class PriceRate implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "time_slot")
    private int timeSlot;
    @Basic
    @Column(name = "hourly_rate")
    private double hourlyRate;

    @Column(name = "monthly_rate")
    private double monthlyRate;
    @Basic
    @Column(name = "peak_time_rate")
    private double peakTimeRate;
    @Basic
    @Column(name = "off_peak_rate")
    private double offPeakRate;
    @Basic
    @Column(name = "spatial_discount_rate")
    private double spatialDiscountRate;
    @Basic
    @Column(name = "vat")
    private double vat;
}
