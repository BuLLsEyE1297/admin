package com.chainsys.collections;

import java.util.ArrayList;


public class TestPassFail {
public static void main(String[] args) {
	ArrayList<Integer> student=new ArrayList<>();
	student.add(50);
	student.add(45);
	student.add(26);

	for(int i=0;i<student.size();i++){
		if(student.get(i)>=35){
			System.out.println("pass"+student.get(i));
					}
		else{
			System.out.println("fail"+student.get(i));
		}
	}
	
}
}
