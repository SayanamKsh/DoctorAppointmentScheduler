package com.appointmentScheduler.notification.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appointmentScheduler.notification.model.EmailDetails;
import com.appointmentScheduler.notification.service.EmailService;

@RestController
@RequestMapping("/notification")
public class NotificationController {
	@Autowired
	EmailService emailService;
	
	@PostMapping("/sendEmail")
    public String sendEmail(@RequestBody EmailDetails emailDetails) {
        if(emailService.sendEmail(emailDetails)) {
        	return "Email sent successfully!";
        }
        return "Failed to mail";
    }
	
}
