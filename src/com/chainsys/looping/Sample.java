package com.chainsys.looping;

import java.util.Scanner;

public class Sample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b, c;
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = a * b;
		System.out.println("the value is" + c);
		int a1, b1;
		float c1;
		a1 = scanner.nextInt();
		b1 = scanner.nextInt();
		c1 = a1 / b1;
		System.out.println("the value is " + c1);
		scanner.close();

	}

}
