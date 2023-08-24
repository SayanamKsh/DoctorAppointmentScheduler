package com.healthcare.appointmentScheduler.userManagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthcare.appointmentScheduler.userManagement.entity.Patient;
import com.healthcare.appointmentScheduler.userManagement.services.PatientService;

@RestController
@RequestMapping("/user")
public class PatientController {

	@Autowired
	PatientService patientService;
	
	@GetMapping("")
	public List<Patient> getAllPatients() {
		return patientService.getAllPatients();
	}
	
	@GetMapping("/{id}")
	public Optional<Patient> getUserById(@PathVariable int id) {
		return patientService.getPatientDetails(id);
	}
}
