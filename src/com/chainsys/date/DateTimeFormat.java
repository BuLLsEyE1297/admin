package com.chainsys.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormat {
	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy");
		String input = "12-12-19";
		LocalDate date = LocalDate.parse(input, formatter);
		System.out.println(date);
	}

}
