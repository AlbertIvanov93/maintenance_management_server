package com.albert.asutoir_rest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.sql.Date;

@Entity
@Data
public class Defect {

    @Id
    @GeneratedValue
    private Long id;

    private int defectivenessLevel;

    private Date discoveryDate;

    private Date fixDate;

    private String description;
}
