package com.technoelevate.dateandtime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class TestClass {
	public static void main(String[] args) throws InterruptedException {
		LocalDate date = LocalDate.now();
		System.out.println(date+"\n");
		
		LocalTime time = LocalTime.now();
		System.out.println(time+"\n");

		LocalDateTime dateTime = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println(dateTime+"\n");
		
		Instant instant = Instant.now();
		System.out.println(instant+"\n");
		
		LocalDateTime time2 = LocalDateTime.of(date, time);
		System.out.println(time2);
		
	}
}
