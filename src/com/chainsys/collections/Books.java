package com.chainsys.collections;

public class Books {

	public int id;
	public String name;
	public float price;

	public static void main(String[] args) {
		Books book = new Books();
		book.id = 1;
		book.name = "java";
		book.price = 23330;
		
		System.out.println(book.id);
	}
}
