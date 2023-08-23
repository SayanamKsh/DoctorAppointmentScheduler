package com.healthcare.appointmentScheduler.userManagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "user")
public class User implements java.io.Serializable{
	@Id
	Integer id;
	
	String userName;
	
	String password;
	
	String mailId;
	
	String phoneNo;
	
	String role;
	

	public User() {
		
	}
	public User(Integer id, String userName, String password, String mailId, String phoneNo, String role) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.mailId = mailId;
		this.phoneNo = phoneNo;
		this.role = role;
	}
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
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
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", mailId=" + mailId
				+ ", phoneNo=" + phoneNo + ", role=" + role + "]";
	}

}
