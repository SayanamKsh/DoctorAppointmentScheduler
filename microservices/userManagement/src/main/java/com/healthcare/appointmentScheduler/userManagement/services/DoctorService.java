package com.healthcare.appointmentScheduler.userManagement.services;

import java.util.List;
import java.util.Optional;

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
	
	public List<Doctor> getAllDoctors() {
		return doctorRepository.findAll();
	}

	public Optional<Doctor> getDoctorDetails(Integer id) {
		return doctorRepository.findById(id);
	}
	
	
}
