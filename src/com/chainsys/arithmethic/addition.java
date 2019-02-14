package com.chainsys.arithmethic;

import java.util.Scanner;

public class addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scanner = new Scanner(System.in );
			System.out.println("enter two int values");
			
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c =a+b;
			System.out.println("the sum is: "+c);
			scanner.close();
	}

}
