package com.appointmentScheduler.appointmentBooking.constant;

import org.springframework.beans.factory.annotation.Value;

public class Constant {
	@Value("${appointmentDurationInHour}")
	public static Integer APPOINTMENT_DURATION_IN_HOUR;
}
