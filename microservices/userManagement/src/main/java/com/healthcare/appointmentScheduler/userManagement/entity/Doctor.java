package com.healthcare.appointmentScheduler.userManagement.entity;

import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@SuppressWarnings("serial")
@Entity
@Table(name = "doctor")
@Data
public class Doctor implements java.io.Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer doctorId;
	
	@OneToOne
	@JoinColumn(name = "user_id",nullable = false)
	private User user;
	
	private String specialty;

	private LocalTime startTime;
	
	private Integer workingHour;
	
	public Integer getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	
	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public Integer getWorkingHour() {
		return workingHour;
	}

	public void setWorkingHour(Integer workingHour) {
		this.workingHour = workingHour;
	}

	public Doctor() {
		
	}

	public Doctor(Integer doctorId, User user, String specialty, LocalTime startTime, Integer workingHour) {
		super();
		this.doctorId = doctorId;
		this.user = user;
		this.specialty = specialty;
		this.startTime = startTime;
		this.workingHour = workingHour;
	}


}
