package com.chainsys.date;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class TestDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today = LocalDate.now();
		System.out.println(today);
		DayOfWeek dayOfWeek = today.getDayOfWeek();
		int year = today.getYear();
		int month = today.getMonthValue();
		int day = today.getDayOfMonth();

		System.out.println(year);
		System.out.println(dayOfWeek);
		System.out.println(month);
		System.out.println(day);

	}

}
