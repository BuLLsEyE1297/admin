package com.chainsys.array;

public class StringManipulation {

	public static void main(String[] args) {
		String[] students = { "sid", "ishu", "mahe" };
		String students1 = "ishu";
		boolean isFound = false;
		for (String temp: students ){
			
			if (temp.equalsIgnoreCase(students1)){
				isFound = true;
				break;
			}
		}
		if(isFound){
			System.out.println("found");
		}
		else{
			System.out.println("not found");
		}
		int [] marks = {100,90,100};
		int sum = 0;
		for (int i=0;i<marks.length;i++){
			sum+=marks[i];
		}
		System.out.println(sum);
	}
	
}