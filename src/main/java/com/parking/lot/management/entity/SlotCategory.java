package com.parking.lot.management.entity;

import com.parking.lot.management.enums.Status;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "SLOT_CATEGORY")
public class SlotCategory implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "status")
    private Status status;

    @Column(name = "category")
    private String category;
}
