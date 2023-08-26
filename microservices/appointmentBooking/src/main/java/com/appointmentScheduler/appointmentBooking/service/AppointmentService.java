package com.appointmentScheduler.appointmentBooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appointmentScheduler.appointmentBooking.entity.Appointment;
import com.appointmentScheduler.appointmentBooking.repository.AppointmentRepository;

@Service
public class AppointmentService {

	@Autowired
	AppointmentRepository appointmentRepository;
	
	public List<Appointment> getAppointmentsByDoctorId(Integer doctorId) {
		return appointmentRepository.findAllByDoctorId(doctorId);
	}
	
	public List<Appointment> getAppointmentsByPatientId(Integer patientId) {
		return appointmentRepository.findAllByPatientId(patientId);
	}
	
	public Appointment createAppointment(Appointment appointment) {
		return appointmentRepository.save(appointment);
	}


}
