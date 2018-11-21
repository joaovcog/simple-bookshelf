package com.jv.bookshelf.app;

import com.jv.bookshelf.service.Bookshelf;

public class App {

	private static final Bookshelf BOOKSHELF = new Bookshelf();
	
	public static void main(String[] args) {
		BOOKSHELF.printAll();
		BOOKSHELF.sortByTitle();
		BOOKSHELF.printAll();
		BOOKSHELF.sortByPageNumber();
		BOOKSHELF.printAll();
	}
	
}