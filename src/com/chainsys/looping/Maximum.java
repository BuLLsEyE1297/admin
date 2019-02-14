package com.chainsys.looping;

import java.util.Scanner;

public class Maximum {
	static int i;
	static int max=0;

	public static void main(String[] args) {
		int[] a = new int[10];
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			a[i] = scanner.nextInt();
			
		}
					 while(a[i]>max){
						 
					 max=a[i];
					 
			 }
			System.out.println("the maximum value is" + max);

			scanner.close();
		}
	}

