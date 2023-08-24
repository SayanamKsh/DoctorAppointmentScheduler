package com.healthcare.appointmentScheduler.userManagement.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthcare.appointmentScheduler.userManagement.entity.Patient;
import com.healthcare.appointmentScheduler.userManagement.repository.PatientRepository;

@RestController
@RequestMapping("/user")
public class PatientService {

	@Autowired
	PatientRepository patientRepository;

	public List<Patient> getAllPatients() {
		return patientRepository.findAll();
	}

	public Optional<Patient> getPatientDetails(int id) {
		return patientRepository.findById(id);
	}
}
