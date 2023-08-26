package com.appointmentScheduler.appointmentBooking.entity;

import java.time.LocalTime;

import com.appointmentScheduler.appointmentBooking.constant.Constant;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "appointment")
public class Appointment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer appointmentId;
	
	@Nonnull
	private Integer doctorId;
	
	@Nonnull
	private Integer patientId;
	
	@Nonnull
	private LocalTime startTime;
	
	@Nonnull
	private String  diseaseCategory;
	
	private String status;
	
	private String commentByPatient;
	
	@Transient
	private Integer appointmentDurationInHour= Constant.APPOINTMENT_DURATION_IN_HOUR;

	public Integer getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(Integer appointmentId) {
		this.appointmentId = appointmentId;
	}

	public Integer getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}

	public Integer getPatientId() {
		return patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public Integer getAppointmentDurationInHour() {
		return appointmentDurationInHour;
	}

	public void setAppointmentDurationInHour(Integer appointmentDurationInHour) {
		this.appointmentDurationInHour = appointmentDurationInHour;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCommentByPatient() {
		return commentByPatient;
	}

	public void setCommentByPatient(String commentByPatient) {
		this.commentByPatient = commentByPatient;
	}

	public String getDiseaseCategory() {
		return diseaseCategory;
	}

	public void setDiseaseCategory(String diseaseCategory) {
		this.diseaseCategory = diseaseCategory;
	}

	public Appointment() {
	}

	public Appointment(Integer appointmentId, Integer doctorId, Integer patientId, LocalTime startTime, String status,
			String commentByPatient, String diseaseCategory, Integer appointmentDurationInHour) {
		super();
		this.appointmentId = appointmentId;
		this.doctorId = doctorId;
		this.patientId = patientId;
		this.startTime = startTime;
		this.status = status;
		this.commentByPatient = commentByPatient;
		this.diseaseCategory = diseaseCategory;
		this.appointmentDurationInHour = appointmentDurationInHour;
	}

	
}
