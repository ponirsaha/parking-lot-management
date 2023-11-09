package com.parking.lot.management.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "BILLING", schema = "parking-lot")
public class Billing implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "vehicle_in_id")
    private int vehicleInId;
    @Basic
    @Column(name = "vehicle_out_id")
    private int vehicleOutId;
    @Basic
    @Column(name = "slot_plan_id")
    private int slotPlanId;
    @Basic
    @Column(name = "total_used_time")
    private String totalUsedTime;
    @Basic
    @Column(name = "used_time_in_price_list")
    private int usedTimeInPriceList;
    @Basic
    @Column(name = "bill_amount")
    private double billAmount;
}
