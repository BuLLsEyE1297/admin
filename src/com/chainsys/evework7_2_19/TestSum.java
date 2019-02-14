package com.chainsys.evework7_2_19;

import java.util.Scanner;

public class TestSum {
	public static void main(String[] args) {
		int[] a;

		a = new int[10];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= 5) {
				System.out.println(a[i]);

			}

		}

		scanner.close();
	}
}