package com.pk.pharma.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pk.pharma.entity.Medicine;
import com.pk.pharma.response.Response;
import com.pk.pharma.response.StatusType;
import com.pk.pharma.service.MedicineService;

@RestController
@RequestMapping("/medicine")
public class MedicineController {

	@Autowired
	private MedicineService medicineService;

	@PostMapping("/create")
	public ResponseEntity<Response> createMedicine(@RequestBody Medicine medicine) {
		Response response = medicineService.createMedicine(medicine);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@PutMapping("/edit/{id}")
	public ResponseEntity<Response> updateMedicine(@RequestBody Medicine medicine, @PathVariable(value = "id") Long id) {
		Response response = medicineService.updateMedicine(medicine, id);
		if (response.getStatus().equals(StatusType.FAIL)) {
			return new ResponseEntity<>(response, HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<>(response, HttpStatus.OK);
		}	
	}

}
