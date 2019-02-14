package com.chainsys.looping;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Scanner scanner =new Scanner(System.in);

	char ch = 0;
	do{
		int day= scanner.nextInt();
	 switch (day){
	 case 1:
		 System.out.println("karthi");
		 break;
	 case 2:
		 System.out.println("robin");
		 break;
	
		 default:
	 }
	 ch=scanner.next().charAt(0);
	}while(ch=='y');
	scanner.close();
	
	}
	
	}


