package com.albert.asutoir_rest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Unit {

    @Id
    @GeneratedValue(generator = "ID_GENERATOR")
    private Long id;

    private String name;

    private int defectivenessLevel;
    
    @ManyToOne
    @JoinColumn(name = "unit_id")
    private Equipment equipment;

    @OneToMany(mappedBy = "unit")
    private Set<Defect> defects = new HashSet<Defect>();
}
