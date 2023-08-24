package com.healthcare.appointmentScheduler.userManagement.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@SuppressWarnings("serial")
@Entity
@Table(name = "user")
@Data
public class User implements java.io.Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	
	private String userName;
	
	private String password;
	
	private String mailId;
	
	private String phoneNo;
	
	private String role;
	
	@OneToOne(mappedBy = "user",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "patientId")
	private Patient patient;
	
	@OneToOne(mappedBy = "user",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "doctorId")
	private Doctor doctor;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public User(Integer id, String userName, String password, String mailId, String phoneNo, String role,
			Patient patient, Doctor doctor) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.mailId = mailId;
		this.phoneNo = phoneNo;
		this.role = role;
		this.patient = patient;
		this.doctor = doctor;
	}

	public User() {
		super();
	}

	
	
}
