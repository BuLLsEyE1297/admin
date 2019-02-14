package com.chainsys.date;

import java.time.LocalDate;

public class LeapYear {
		static boolean isLeapyear (int year){
			if(year%400==0)
				return true;
			else if(year%100==0)
				return false;
			else if(year%4==0)
				return true;
			
			return false;
		}
		public static void main(String[] args) {
			LocalDate today = LocalDate.now();
			System.out.println(today);
			int year = today.getYear();
			int month = today.getMonthValue();
			int day = today.getDayOfMonth();
			
			System.out.println(year +"  "+month+" "+day+" ");
			System.out.println(isLeapyear(2016));

		}
	}
