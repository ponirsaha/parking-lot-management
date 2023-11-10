package com.parking.lot.management.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "BILLING")
public class Billing implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @OneToOne
    private VehicleReservation vehicleReservation;

    @OneToOne
    private VehicleOut vehicleOut;

    @Column(name = "total_used_time")
    private String totalUsedTime;

    @Column(name = "used_time_in_price_list")
    private int usedTimeInPriceList;

    @Column(name = "bill_amount")
    private double billAmount;

    @ManyToOne
    @JoinColumn(name = "billing")
    private SlotPlan slotPlan;
}
