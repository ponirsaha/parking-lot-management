package com.parking.lot.management.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "VEHICLE_IN")
public class VehicleReservation implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "vehicle_no")
    private String vehicleNo;

    @Column(name = "vehicle_type")
    private String vehicleType;

    @Column(name = "vehicle_color")
    private String vehicleColor;

    @Column(name = "lot_in_time")
    private Date lotInTime;

    @ManyToOne
    @JoinColumn(name = "vehicleIn")
    private SlotPlan slotPlan;
    @OneToOne
    private VehicleOut vehicleOut;
}
