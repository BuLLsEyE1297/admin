package com.chainsys.looping;

import java.util.Scanner;

public class Valid {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char ch=0;
		String ph;
		do{
		ph = scanner.next();
		if (ph.length() == 10) {
			System.out.println("valid");
		}

		else {
			System.out.println("not valid");
		}
		ch=scanner.next().charAt(0);
		}while (ch=='y');
	
		scanner.close();
	}
}
