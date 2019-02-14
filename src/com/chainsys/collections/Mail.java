package com.chainsys.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Mail {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		System.out.println("enter how many email to be inserted");
		int size;
		Scanner scanner = new Scanner(System.in);
		size = scanner.nextInt();
		boolean isFound = false;
		for (int i = 0; i < size; i++) {
			String a = scanner.next();
			list.add(a);
		}
		System.out.println("enter the mail id to check");
		String check = scanner.next();
		for (String s : list) {
			if (s.equals(check)) {
				isFound = true;
				break;
			}
		}
		if (isFound)
			System.out.println("Exists");
		else
			System.out.println("not exists");
		scanner.close();
	}
}
