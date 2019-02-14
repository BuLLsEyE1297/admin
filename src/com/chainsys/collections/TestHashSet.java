package com.chainsys.collections;

import java.util.TreeSet;

public class TestHashSet {
	public static void main(String[] args) {
	
   TreeSet<String> books = new TreeSet<>();
   books.add("mysql"); 
   books.add("core java"); 
   books.add("mysql") ;
   books.add("null") ;

   
   for(String book:books){
	   System.out.println(book);
   }

	}
}
