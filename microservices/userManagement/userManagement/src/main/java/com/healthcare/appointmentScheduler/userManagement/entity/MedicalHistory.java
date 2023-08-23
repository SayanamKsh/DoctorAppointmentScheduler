package com.healthcare.appointmentScheduler.userManagement.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


public class MedicalHistory implements java.io.Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	
	@ManyToOne
    @JoinColumn(name = "userId")
	Patient patient;

}
