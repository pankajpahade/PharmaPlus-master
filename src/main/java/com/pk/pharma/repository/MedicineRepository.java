package com.pk.pharma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pk.pharma.entity.Medicine;

@Repository
public interface MedicineRepository extends JpaRepository<Medicine, Long>{

	Medicine findByMedicineName(String medicineName);

}
