package com.chainsys.collections;

import java.util.HashSet;
import java.util.Iterator;

public class TestFound {
	public static void main(String[] args) {
		String check = "c";
		HashSet<String> books = new HashSet<>();
		String book = "c,java,mysql,corejava";
		String[] b = book.split(",");
		for (String w : b) {
			books.add(w);
		}
		Iterator<String> it = books.iterator();
		while (it.hasNext()) {
			String books1 = it.next();
			if (books1.startsWith(check)) {

				System.out.println(books1);

			}
		}
	}
}