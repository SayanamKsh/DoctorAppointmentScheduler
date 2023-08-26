package com.healthcare.appointmentScheduler.userManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.healthcare.appointmentScheduler.userManagement.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer>{
	
}
