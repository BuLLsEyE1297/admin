package com.chainsys.bookapplication;

import java.util.ArrayList;
import java.util.Scanner;

public class TestBookApplication {

	
	void displayAllBooks() {

		ArrayList<Book> hs = new ArrayList<>();
		hs = BookDb.fetch();
		System.out.println(hs);
	}

	private static Book getBooks() {
		ArrayList<Book> hs = new ArrayList<>();
		hs = BookDb.fetch();

		Book searchBook = null;
		for (Book book : hs) {
			System.out.println(book);
			if (hs.contains(book)) {
				searchBook = book;
				break;
			}
		}
		return searchBook;
	}

	private static boolean getInputs(Scanner scanner) {

		char select;
		do {
			System.out.println("Enter the book id");
			int id = scanner.nextInt();
			System.out.println("Enter the book name");
			String name = scanner.next();
			System.out.println("Enter the book price");
			float price = scanner.nextFloat();

			BookDb.insert(id, name, price);

			System.out.println("Do You want to continue(Y/y)");
			select = scanner.next().charAt(0);
		} while (select == 'Y' || select == 'y');

		return false;
	}

	private static void getBookById(int bookId) {
		Book book = getBooks();

		if (book.getId() == bookId) {
			System.out.println(book.getId() + " " + book.getBookName() + " "
					+ book.getPrice());
		}

		else {
			System.out.println("Not Found");
		}

	}

	private static void getBookByName(String bookName) {

		Book book = getBooks();

		if (book.getBookName().equals(bookName)) {
			System.out.println(book.getId() + " " + book.getBookName() + " "
					+ book.getPrice());
		}

		else {
			System.out.println("Not Found");
		}

	}

	private static void getBookByPrice(float price) {
		Book book = getBooks();

		if (book.getPrice() == price) {
			System.out.println(book.getId() + " " + book.getBookName() + " "
					+ book.getPrice());
		}

		else {
			System.out.println("Not Found");
		}

	}

	static void select(Scanner scanner) {
		

		char select = 0;
		do {
			System.out.println("How do you want to fetch the book");
			System.out.println();
			System.out.println("1.Book ID");
			System.out.println("2.Name");
			System.out.println("3.Price");
			int option = scanner.nextInt();
			switch (option) {
			case 1: {
				System.out.println("Enter the book ID");
				int id = scanner.nextInt();
				getBookById(id);

			}
				break;
			case 2: {
				System.out.println("Enter the Name");
				String name = scanner.next();
				getBookByName(name);

			}
				break;
			case 3: {
				System.out.println("Enter the price");
				float price = scanner.nextFloat();
				getBookByPrice(price);

			}
				break;

			default:
				System.out.println("Invalid input");
				break;
			}
			System.out.println("Do You want to continue(Y/y)");
			select = scanner.next().charAt(0);
		} while (select == 'Y' || select == 'y');

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		getInputs(scanner);
		select(scanner);
		scanner.close();
		
		
	}
}
