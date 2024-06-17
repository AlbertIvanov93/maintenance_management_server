package com.albert.asutoir_rest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.sql.Date;
import java.util.List;

@Entity
@Data
public class Equipment {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private int value;

    private Date productionDate;

    private Date  majorRepairDate;

    private Date commissioningDate;

    @OneToMany
    private List<Unit> units;



}

