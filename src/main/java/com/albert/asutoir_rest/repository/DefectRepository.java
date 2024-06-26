package com.albert.asutoir_rest.repository;

import com.albert.asutoir_rest.model.Defect;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DefectRepository extends JpaRepository<Defect, Long> {
}
