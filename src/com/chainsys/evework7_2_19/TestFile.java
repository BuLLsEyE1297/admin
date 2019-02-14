package com.chainsys.evework7_2_19;

import java.util.Scanner;

public class TestFile {
	public static void main(String[] args) {

		int[] a, b, c;

		a = new int[7];
		b = new int[7];
		c = new int[7];

		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 7; i++) {
			a[i] = scanner.nextInt();

		}
		for (int i = 0; i < 7; i++) {
			b[i] = scanner.nextInt();
		}
		for (int i = 0; i < 7; i++) {
			c[i] = a[i] + b[i];
		}

		for (int i = 0; i < 7; i++) {
			System.out.println("the value is   " + c[i]);
		}

		scanner.close();
	}
}