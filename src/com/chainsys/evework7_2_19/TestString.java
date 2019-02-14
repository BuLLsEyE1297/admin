package com.chainsys.evework7_2_19;

import java.util.Scanner;

public class TestString {

	public static void main(String[] args) {
		String[] a;
		a= new String[5];
		Scanner scanner= new Scanner(System.in);
		for (int i=0;i<a.length;i++){
			a[i]=scanner.next();
		}
		for (int j=0;j<a.length;j++){
		System.out.println(a[j]);
		}
		scanner.close();
	}

}
