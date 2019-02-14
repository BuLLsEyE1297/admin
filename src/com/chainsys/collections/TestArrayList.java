package com.chainsys.collections;

import java.util.ArrayList;
import java.util.Scanner;


public class TestArrayList {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		 list.add("karthikeyan@gmail.com");
		 list.add("robinrathya@gmail.com");
		 list.add("sakthimahesh@gmail.com");
		 list.add("kavin@gmail.com");
		 Scanner scanner=new Scanner(System.in);
		 String A=scanner.next();
		 if(list.contains(A)){
			 System.out.println("mail is exist");
			 }
		 else{
			 System.out.println("mail does not exist");
		 }
		 scanner.close();
	}

}
