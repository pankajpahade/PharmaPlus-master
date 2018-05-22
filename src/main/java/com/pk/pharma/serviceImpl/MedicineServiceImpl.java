package com.pk.pharma.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pk.pharma.entity.Medicine;
import com.pk.pharma.repository.MedicineRepository;
import com.pk.pharma.service.MedicineService;

@Service("medicineService")
public class MedicineServiceImpl implements MedicineService {

	@Autowired
	private MedicineRepository medicineRepository;

	@Override
	public Medicine createMedicine(Medicine medicine) {
		return medicineRepository.save(medicine);
	}

	public Medicine findMedicineByName(String medicineName) {
		return medicineRepository.findByMedicineName(medicineName);
	}

	@Override
	public Optional<Medicine> findMedicineById(Long id) {
		return medicineRepository.findById(id);
	}

	@Override
	public Medicine updateMedicine(Medicine medicine) {
		return medicineRepository.save(medicine);
	}

}
