package com.appointmentScheduler.appointmentBooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.appointmentScheduler.appointmentBooking.entity.Appointment;
import com.appointmentScheduler.appointmentBooking.service.AppointmentService;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {

	@Autowired
	AppointmentService appointmentService;
	
	@GetMapping("/getAppointmentsByDoctorId")
	public List<Appointment> getAppointmentsByDoctorId(@RequestParam("id") Integer doctorId) {
		return appointmentService.getAppointmentsByDoctorId(doctorId);
	}
	
	@GetMapping("/getAppointmentsByPatientId")
	public List<Appointment> getAppointmentsByPatientId(@RequestParam("id") Integer patientId) {
		return appointmentService.getAppointmentsByPatientId(patientId);
	}
	
	@PostMapping("")
	public Appointment createAppointment(@RequestBody Appointment appointment) {
		return appointmentService.createAppointment(appointment);
	}
}
