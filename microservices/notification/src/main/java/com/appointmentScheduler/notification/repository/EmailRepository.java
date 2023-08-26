package com.appointmentScheduler.notification.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appointmentScheduler.notification.model.EmailDetails;

public interface EmailRepository extends JpaRepository<EmailDetails, Integer>{

}
