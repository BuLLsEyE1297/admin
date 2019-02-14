package com.chainsys.evework7_2_19;

import java.util.Scanner;

public class TestAdd {
	public static void main(String[] args) {
		int[] a;
		int b = 0;

		a = new int[10];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			b += (a[i]);

		}
		System.out.println(b);

		scanner.close();

	}

}
