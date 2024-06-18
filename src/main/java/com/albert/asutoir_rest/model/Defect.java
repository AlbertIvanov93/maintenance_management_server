package com.albert.asutoir_rest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.sql.Date;

@Entity
@Data
public class Defect {

    @Id
    @GeneratedValue(generator = "ID_GENERATOR")
    private Long id;

    private int defectivenessLevel;

    private Date discoveryDate;

    private Date fixDate;

    private String description;
    
    @ManyToOne
    @JoinColumn(name = "unit_id")
    private Unit unit;
    
    @ManyToOne
    @JoinColumn(name = "equipment_id")
    private Equipment equipment;
}
