package com.healthcare.appointmentScheduler.userManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthcare.appointmentScheduler.userManagement.entity.Doctor;
import com.healthcare.appointmentScheduler.userManagement.services.DoctorService;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

	@Autowired
	DoctorService doctorService;
	
	
	@PostMapping("/create")
	public Doctor createUser(@RequestBody Doctor doctor) {
		return doctorService.createDoctor(doctor);
	}
	
	
}
