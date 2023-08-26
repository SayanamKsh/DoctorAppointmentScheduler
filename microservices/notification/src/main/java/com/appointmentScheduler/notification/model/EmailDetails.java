package com.appointmentScheduler.notification.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "emailDetails")
public class EmailDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Nonnull
	private Integer userId;
	@Nonnull
	private String toReceiver;
	private String cc;
	private String bcc;
	@Nonnull
	private String subject;
	private String body;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	public String getToReceiver() {
		return toReceiver;
	}
	public void setToReceiver(String toReceiver) {
		this.toReceiver = toReceiver;
	}
	public String getCc() {
		return cc;
	}
	public void setCc(String cc) {
		this.cc = cc;
	}
	public String getBcc() {
		return bcc;
	}
	public void setBcc(String bcc) {
		this.bcc = bcc;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
	public EmailDetails() {
	}
	
	public EmailDetails(Integer id, Integer userId, String toReceiver, String cc, String bcc, String subject, String body) {
		super();
		this.id = id;
		this.userId = userId;
		this.toReceiver = toReceiver;
		this.cc = cc;
		this.bcc = bcc;
		this.subject = subject;
		this.body = body;
	}
	
	
}
