package com.parking.lot.management.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;
@Data
@Entity
@Table(name = "VEHICLE_IN", schema = "parking-lot")
public class VehicleIn implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "vehicle_no")
    private String vehicleNo;
    @Basic
    @Column(name = "vehicle_type")
    private String vehicleType;
    @Basic
    @Column(name = "vehicle_color")
    private String vehicleColor;
    @Basic
    @Column(name = "slot_plan_id")
    private int slotPlanId;
    @Basic
    @Column(name = "lot_in_time")
    private Timestamp lotInTime;
}
