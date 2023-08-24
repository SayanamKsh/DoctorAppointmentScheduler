package com.healthcare.appointmentScheduler.userManagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthcare.appointmentScheduler.userManagement.entity.Doctor;
import com.healthcare.appointmentScheduler.userManagement.services.DoctorService;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

	@Autowired
	DoctorService doctorService;
	
	@PostMapping("")
	public List<Doctor> getAllDoctors() {
		return doctorService.getAllDoctors();
	}
	@PostMapping("/{id}")
	public Optional<Doctor> getDoctorDetails(@PathVariable Integer id) {
		return doctorService.getDoctorDetails(id);
	}
	
	
}
