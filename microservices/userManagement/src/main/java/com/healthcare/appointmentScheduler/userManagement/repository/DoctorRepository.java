package com.healthcare.appointmentScheduler.userManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.healthcare.appointmentScheduler.userManagement.entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer>{
	
}
