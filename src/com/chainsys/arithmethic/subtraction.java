package com.chainsys.arithmethic;

import java.util.Scanner;

public class subtraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
		System.out.println("enter the values");

		int a = scanner.nextInt();
		int b = scanner.nextInt();

		int c = a - b;
		System.out.println("the sub is: " + c);
		scanner.close();
	}

}
