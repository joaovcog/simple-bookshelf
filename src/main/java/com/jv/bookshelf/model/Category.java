package com.jv.bookshelf.model;

public enum Category {
	AGILE("Agile"),
	LITERATURE_FICTION("Literature & Fiction"),
	PROGRAMMING("Programming"),
	SELF_IMPROVEMENT("Self-improvement"),
	SOFTWARE_DEVELOPMENT("Software Development"),
	SOFTWARE_ENGINEERING("Software Engineering"),
	SYSTEM_ANALYSIS("System Analysis");
	
	private final String description;
	
	private Category(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
}