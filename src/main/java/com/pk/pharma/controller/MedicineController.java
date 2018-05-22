package com.pk.pharma.controller;

import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pk.pharma.customException.PharmaPLusException;
import com.pk.pharma.entity.Medicine;
import com.pk.pharma.service.MedicineService;

@RestController
@RequestMapping("/medicine")
public class MedicineController {

	@Autowired
	private MedicineService medicineService;

	@PostMapping("/create")
	public ResponseEntity<?> createMedicine(@RequestBody Medicine medicine) {
		Medicine med = medicineService.findMedicineByName(medicine.getMedicineName());
		try {
			if (med != null) {
				return new ResponseEntity<>(medicine.getMedicineName() + " is already exist in record",
						HttpStatus.CONFLICT);
			} else {
				medicine = medicineService.createMedicine(medicine);
				return new ResponseEntity<>(medicine, HttpStatus.OK);
			}
		} catch (Exception e) {
			return new ResponseEntity<>("Failed to create medicine", HttpStatus.NO_CONTENT);
		}
	}

	@PutMapping("/edit/{id}")
	public ResponseEntity<?> updateMedicine(@RequestBody Medicine medicine, @PathVariable(value = "id") Long id) {
		try {
				Medicine med = medicineService.updateMedicine(medicine);
				System.out.println("========="+med);
				return new ResponseEntity<>(medicine, HttpStatus.OK);
		} catch (PharmaPLusException e) {
			return new ResponseEntity<>(
					"Medicine with name " + medicine.getMedicineName() + " is already exist in record",
					HttpStatus.CONFLICT);
		} catch (Exception e) {
			return new ResponseEntity<>("Failed to update medicine", HttpStatus.NO_CONTENT);
		}
	}

}
