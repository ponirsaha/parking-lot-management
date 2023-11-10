package com.parking.lot.management.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "VEHICLE_OUT")
public class VehicleOut implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "vehicle_out_time")
    private Date vehicleOutTime;

    @OneToOne
    private VehicleReservation vehicleReservation;
}
