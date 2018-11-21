package com.jv.bookshelf.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import com.jv.bookshelf.model.Book;
import com.jv.bookshelf.model.Category;

public class Bookshelf {
	
	private static final List<Book> BOOKS = new ArrayList<>();
	
	static {
		BOOKS.add(new Book(1, "Java EE 8 Application Development", "David R. Heffelfinger", Category.PROGRAMMING, 372, LocalDate.of(2017, 12, 12), new BigDecimal("250"), false));
		BOOKS.add(new Book(2, "Effective Java", "Joshua Bloch", Category.PROGRAMMING, 416, LocalDate.of(2018, 1, 6), new BigDecimal("150"), true));
		BOOKS.add(new Book(3, "Clean Code", "Robert C. Martin", Category.SOFTWARE_DEVELOPMENT, 464, LocalDate.of(2008, 8, 1), new BigDecimal("70"), true));
		BOOKS.add(new Book(4, "High-Performance Java Persistence", "Vlad Mihalcea", Category.PROGRAMMING, 486, LocalDate.of(2016, 10, 12), new BigDecimal("217"), false));
		BOOKS.add(new Book(5, "Essential Scrum: A Practical Guide to the Most Popular Agile Process", "Kenneth S. Rubin", Category.AGILE, 500, LocalDate.of(2012, 8, 5), new BigDecimal("210.85"), false));
		BOOKS.add(new Book(6, "Domain Driven Design", "Eric Evans", Category.SYSTEM_ANALYSIS, 563, LocalDate.of(2003, 8, 22), new BigDecimal("71.5"), false));
		BOOKS.add(new Book(7, "Pro Jpa 2 in Java EE 8", "Mike Keith, Merrick Schincariol, Massimo Nardone", Category.PROGRAMMING, 784, LocalDate.of(2018, 2, 6), new BigDecimal("170"), true));
		BOOKS.add(new Book(8, "Software Engineering: A Practitioner's Approach", "Roger S. Pressman, Bruce Maxim", Category.SOFTWARE_ENGINEERING, 976, LocalDate.of(2014, 1, 23), new BigDecimal("180"), true));
		BOOKS.add(new Book(9, "Secrets of the Millionaire Mind", "T. Harv Eker", Category.SELF_IMPROVEMENT, 210, LocalDate.of(2005, 2, 15), new BigDecimal("14.11"), false));
		BOOKS.add(new Book(10, "The Miracle Morning", "Hal Elrod", Category.SELF_IMPROVEMENT, 180, LocalDate.of(2012, 12, 7), new BigDecimal("17.89"), true));
		BOOKS.add(new Book(11, "The Lord of the Ring: The Fellowship of the Ring", "J. R. R. Tolkien", Category.LITERATURE_FICTION, 432, LocalDate.of(2012, 9, 18), new BigDecimal("19.50"), true));
	}
	
	public boolean add(Book book) {
		return BOOKS.add(book);
	}
	
	public Book get(int index) {
		return BOOKS.get(index);
	}
	
	public Book get(String title) {
		return null;
	}
	
	public void printAll() {
		System.out.println("\nBOOKSHELF:\n");
		BOOKS.stream().forEach(System.out::println);
	}
	
	public void printByCategory(Category category) {
		Stream.empty();
	}
	
	public void printCountByCategories() {
		// TO-DO   print book count by categories
	}
	
	public void printCountByStatus() {
		// TO-DO   print book count for read and unread books
	}
	
	public void sortByTitle() {
		Comparator<Book> sortTitle = new Comparator<Book>() {
			@Override
			public int compare(Book b1, Book b2) {
				return b1.getTitle().compareTo(b2.getTitle());
			}
		};
		
		BOOKS.sort(sortTitle);
	}
	
	public void sortByPageNumber() {
		Comparator<Book> sortPage = new Comparator<Book>() {
			@Override
			public int compare(Book b1, Book b2) {
				return b1.getPages() < b2.getPages() ? -1 : 1;
			}
		};
		
		BOOKS.sort(sortPage);
	}
	
}
