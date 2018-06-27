package com.pk.pharma.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.pk.pharma.customException.PharmaPLusException;
import com.pk.pharma.entity.Medicine;
import com.pk.pharma.repository.MedicineRepository;
import com.pk.pharma.response.Response;
import com.pk.pharma.response.StatusType;
import com.pk.pharma.service.MedicineService;

@Service
public class MedicineServiceImpl implements MedicineService {

	@Autowired
	private MedicineRepository medicineRepository;

	@Override
	public Response createMedicine(Medicine medicine) {
		Response response = new Response();
		Medicine med = medicineRepository.findByMedicineName(medicine.getMedicineName());
		try {
			if (med != null) {
				throw new PharmaPLusException(
						"Medicine with name " + medicine.getMedicineName() + " is already exist in record",
						HttpStatus.NO_CONTENT, StatusType.FAIL);
			} else {
				medicine = medicineRepository.save(medicine);
				response.setErrorMessage("Successfuly Created");
				response.setStatus(StatusType.SUCCESS);
				response.setResult(medicine);
				response.setErrorCode(HttpStatus.OK);
			}
		} catch (PharmaPLusException e) {
			e.getMessage();
		}
		return response;
	}

	/*
	 * public Medicine findMedicineByName(String medicineName) { return
	 * medicineRepository.findByMedicineName(medicineName); }
	 */

	@Override
	public Optional<Medicine> findMedicineById(Long id) {
		return medicineRepository.findById(id);
	}

	@Override
	public Response updateMedicine(Medicine medicine, Long id) {
		Response response = new Response();
		Medicine med = medicineRepository.findByMedicineName(medicine.getMedicineName());
		try {
			if (med != null) {
				if (id.equals(med.getId())) {
					medicine = medicineRepository.save(medicine);
					response.setErrorMessage("Successfully Updated");
					response.setResult(medicine);
					response.setErrorCode(HttpStatus.OK);
					response.setStatus(StatusType.SUCCESS);
				} else {
					response.setErrorMessage("Medicine with name " + medicine.getMedicineName() + " is already exist in record");
					response.setErrorCode(HttpStatus.NO_CONTENT);
					response.setStatus(StatusType.FAIL);
					/*throw new PharmaPLusException(
							"Medicine with name " + medicine.getMedicineName() + " is already exist in record",
							HttpStatus.NO_CONTENT, StatusType.FAIL);*/
				}
			} else {
				medicine = medicineRepository.save(medicine);
				response.setErrorMessage("Successfully Updated");
				response.setResult(medicine);
				response.setErrorCode(HttpStatus.OK);
				response.setStatus(StatusType.SUCCESS);
			}
		} catch (Exception e) {
          e.getMessage();
		}
		return response;
	}

}
