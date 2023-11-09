package com.parking.lot.management.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "SLOT_CATEGORY", schema = "parking-lot")
public class SlotCategory implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "status")
    private String status;
    @Basic
    @Column(name = "category")
    private String category;
}
