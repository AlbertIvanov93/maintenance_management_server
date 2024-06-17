package com.albert.asutoir_rest.controller;

import com.albert.asutoir_rest.model.Equipment;
import com.albert.asutoir_rest.repository.EquipmentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/equipments",
        produces = "application/json")
public class EquipmentController {

    private final EquipmentRepository equipmentRepository;

    public EquipmentController(EquipmentRepository equipmentRepository) {
        this.equipmentRepository = equipmentRepository;
    }

    @GetMapping
    List<Equipment> getAllEquipment() {
        return equipmentRepository.findAll();
    }

    @PostMapping
    Equipment newEquipment(@RequestBody Equipment equipment) {
        return equipmentRepository.save(equipment);
    }

    @GetMapping("/{id}")
    Equipment getEquipmentById(@PathVariable int id) {
        return equipmentRepository.findById(id).orElseThrow(() -> new UnsupportedOperationException());
    }
}
