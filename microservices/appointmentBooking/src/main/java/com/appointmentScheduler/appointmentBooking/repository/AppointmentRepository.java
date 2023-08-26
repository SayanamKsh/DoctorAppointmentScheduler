package com.appointmentScheduler.appointmentBooking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appointmentScheduler.appointmentBooking.entity.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer>{

	List<Appointment> findAllByDoctorId(Integer doctorId);
	
	List<Appointment> findAllByPatientId(Integer patientId);

}
