package com.parking.lot.management.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;
@Data
@Entity
@Table(name = "VEHICLE_OUT", schema = "parking-lot")
public class VehicleOut implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "vehicle_in_id")
    private int vehicleInId;
    @Basic
    @Column(name = "vehicle_out_time")
    private Timestamp vehicleOutTime;
}
