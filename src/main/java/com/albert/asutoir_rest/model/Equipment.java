package com.albert.asutoir_rest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Equipment {

    @Id
    @GeneratedValue(generator = "ID_GENERATOR")
    private Long id;

    private String name;

    private int value;

    private Date productionDate;

    private Date  majorRepairDate;

    private Date commissioningDate;

    @OneToMany(mappedBy = "equipment")
    private Set<Unit> units = new HashSet<Unit>();

    @OneToMany(mappedBy = "equipment")
    private Set<Defect> defects = new HashSet<Defect>();

}

