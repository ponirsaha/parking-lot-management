package com.parking.lot.management.entity;

import com.parking.lot.management.enums.Status;
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

    @Column(name = "slot_number")
    private String slotNumber;

    @Column(name = "slot_info")
    private String slotInfo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "slot_category_id", referencedColumnName = "id")
    private SlotCategory slotCategoryId;

    @Column(name = "status")
    private Status status;
}
