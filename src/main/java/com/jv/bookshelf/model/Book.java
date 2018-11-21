package com.jv.bookshelf.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Book {

	private Integer id;
	private String title;
	private String author;
	private Category category;
	private int pages;
	private LocalDate editionDate;
	private BigDecimal value;
	private String description = "";
	private boolean read;

	public Book() {

	}

	public Book(Integer id, String title, String author, Category category, int pages, LocalDate editionDate, BigDecimal value,
			boolean read) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.category = category;
		this.pages = pages;
		this.editionDate = editionDate;
		this.value = value;
		this.read = read;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public LocalDate getEditionDate() {
		return editionDate;
	}

	public void setEditionDate(LocalDate editionDate) {
		this.editionDate = editionDate;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isRead() {
		return read;
	}

	public void setRead(boolean read) {
		this.read = read;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return id + " | " + title + " | " + author + " | " + category.getDescription() + " | " + pages + " | " + editionDate + " | " + (read ? "read" : "unread");
	}

}