package com.chainsys.bookapplication;

import java.util.ArrayList;

public class BookDb {
	static ArrayList<Book> bookSet = new ArrayList<>();

	public static void insert(int bookId, String bookName, float bookPrice) {
		Book book = new Book();
		book.setId(bookId);
		book.setBookName(bookName);
		book.setPrice(bookPrice);
		bookSet.add(book);

	}

	public static ArrayList<Book> fetch() {

		return bookSet;

	}
}
