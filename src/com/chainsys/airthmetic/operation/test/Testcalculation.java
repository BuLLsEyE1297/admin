package com.chainsys.airthmetic.operation.test;

import java.util.Scanner;
 
import com.chainsys.airthmetic.operation.Operation;


public class Testcalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
		System.out.println("enter the values");

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
			
		System.out.println("Addition");
		int sum=Operation.addition(a,b);
		System.out.println(sum);
		
		
		System.out.println("subtration");
		int difference=Operation.subtraction(a,b);
		System.out.println(difference);
		
		System.out.println("multiplication");
		int product=Operation.multiplication(a,b);
		
		System.out.println(product);
		 scanner.close();
		
	}

}
