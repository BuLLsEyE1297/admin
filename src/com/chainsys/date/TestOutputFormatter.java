package com.chainsys.date;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class TestOutputFormatter {
	public static void main(String[] args) {
		LocalDateTime today = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter
				.ofPattern("E, MM dd yyyy,hh:mm:ss ");
		String WeekDay = formatter.format(today);
		System.out.println(WeekDay);
		DayOfWeek day = today.getDayOfWeek();
		System.out.println(day);	
	}
}
