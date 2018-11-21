package com.jv.bookshelf.app;

import com.jv.bookshelf.service.Bookshelf;

public class App {

	private static final Bookshelf BOOKSHELF = new Bookshelf();
	
	public static void main(String[] args) {
		BOOKSHELF.print();
		BOOKSHELF.sortByTitle();
		BOOKSHELF.print();
		BOOKSHELF.sortByPageNumber();
		BOOKSHELF.print();
	}
	
}