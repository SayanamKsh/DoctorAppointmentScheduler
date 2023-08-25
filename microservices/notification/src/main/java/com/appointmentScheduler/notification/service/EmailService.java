package com.appointmentScheduler.notification.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.appointmentScheduler.notification.model.EmailDetails;
import com.appointmentScheduler.notification.repository.EmailRepository;

@Service
public class EmailService {
	
	@Autowired
	EmailRepository emailRepository;
	
	private final JavaMailSender mailSender;
	@Autowired
    public EmailService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }
	
	public boolean sendEmail(EmailDetails emailDetails) {
		try {
			SimpleMailMessage message = new SimpleMailMessage();
	        message.setTo(emailDetails.getToReceiver());
	        message.setSubject(emailDetails.getSubject());
	        message.setText(emailDetails.getBody());
	        mailSender.send(message);
	        emailRepository.save(emailDetails);
	        return true;
		} catch (Exception e) {
			return false;
		}
    }
}
