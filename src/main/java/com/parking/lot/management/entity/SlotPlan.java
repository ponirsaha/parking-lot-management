package com.parking.lot.management.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "SLOT_PLAN", schema = "parking-lot")
public class SlotPlan implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "slot_number")
    private String slotNumber;
    @Basic
    @Column(name = "slot_info")
    private String slotInfo;
    @Basic
    @Column(name = "slot_category_id")
    private int slotCategoryId;
    @Basic
    @Column(name = "status")
    private String status;
}
