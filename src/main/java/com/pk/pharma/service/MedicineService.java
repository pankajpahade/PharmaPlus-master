package com.pk.pharma.service;

import java.util.Optional;

import com.pk.pharma.entity.Medicine;

public interface MedicineService {

	Medicine createMedicine(Medicine medicine);

	Medicine findMedicineByName(String medicineName);

	Optional<Medicine> findMedicineById(Long id);

	Medicine updateMedicine(Medicine medicine);

}
