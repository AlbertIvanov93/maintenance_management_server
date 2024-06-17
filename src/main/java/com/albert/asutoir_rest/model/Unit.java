package com.albert.asutoir_rest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Unit {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private int defectivenessLevel;

    @OneToMany
    private List<Defect> defects;
}
