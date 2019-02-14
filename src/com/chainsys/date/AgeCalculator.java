package com.chainsys.date;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter your DOB (YYYY-MM-DD)");
		String inputDate = scanner.next();
		LocalDate dob = LocalDate.parse(inputDate);
		
		Period period = Period . between(dob, today);
		int age = period.getYears();
		System.out.println("you are"+age+"years young");
		scanner.close();
	}

}
