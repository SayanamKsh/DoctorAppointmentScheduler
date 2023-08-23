package com.healthcare.appointmentScheduler.userManagement.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthcare.appointmentScheduler.userManagement.entity.Doctor;
import com.healthcare.appointmentScheduler.userManagement.repository.DoctorRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class DoctorService {

	@Autowired
	DoctorRepository doctorRepository;
	
	public Doctor createDoctor(Doctor doctor) {
		return doctorRepository.save(doctor);
	}
	
	
}
