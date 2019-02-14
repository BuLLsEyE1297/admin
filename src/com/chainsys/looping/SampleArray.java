package com.chainsys.looping;

import java.util.Scanner;

public class SampleArray {
public static void main(String[] args) {
	 int sum=0;
	Scanner scanner=new Scanner(System.in);
	int[] marks=new int[50];
	
	for(int i=0;i<10;i++){
		marks[i]=scanner.nextInt();
		sum+=marks[i];
	}
	
	System.out.println(sum);
	scanner.close();
	
	char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',  
            'i', 'n', 'a', 't', 'e', 'd' };  
    //declaring a destination array  
    char[] copyTo = new char[7];  
    //copying array using System.arraycopy() method  
    System.arraycopy(copyFrom, 2, copyTo, 0, 7);  
    //printing the destination array  
    System.out.println(String.valueOf(copyTo));  
}
}
