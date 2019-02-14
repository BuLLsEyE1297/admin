package com.chainsys.collections;

public class TestSplit {
	public static void main(String[] args) {
		String a = "the-world-is -not -bigger";

		String[] b =a.split("-");
		for(String w : b){
			System.out.println(w);
		}
		System.out.println("the length of"+b.length);
	}
}




