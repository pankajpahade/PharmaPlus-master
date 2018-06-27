package com.pk.pharma.service;

import java.util.Optional;

import com.pk.pharma.entity.Medicine;
import com.pk.pharma.response.Response;

public interface MedicineService {

	Response createMedicine(Medicine medicine);

	//Medicine findMedicineByName(String medicineName);

	Optional<Medicine> findMedicineById(Long id);

	Response updateMedicine(Medicine medicine, Long id);

}
