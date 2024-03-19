package com.alameendev.librarymanagement.model;

public class Book {

	private static int uniqueId;
	private int availableCount;
	private String name;
	private int id;
	private String author;
	private String publication;
	private String edition;
	private String genre;
	private int volume;
	static {
		uniqueId = 1;
	}

	private Book(Builder builder) {
		this.name = builder.name;
		this.id = Book.uniqueId++;
		this.author = builder.author;
		this.publication = builder.publication;
		this.edition = builder.edition;
		this.genre = builder.genre;
		this.availableCount = builder.availableCount;
		this.volume = builder.volume;
	}

	public void deductAvailableCount() {
		this.availableCount--;
	}

	public void increaseAvailableCount() {
		this.availableCount++;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String getAuthor() {
		return author;
	}

	public String getPublication() {
		return publication;
	}

	public String getEdition() {
		return edition;
	}

	public String getGenre() {
		return genre;
	}

	public int getAvailableCount() {
		return availableCount;
	}

	public int getVolume() {
		return volume;
	}

	public void updateStock(int newBooks) {
		this.availableCount += newBooks;
	}
	public static class Builder {

		private String name;
		private String author;
		private String publication;
		private String edition;
		private String genre;
		private int availableCount;
		private int volume;

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder author(String author) {
			this.author = author;
			return this;
		}

		public Builder publication(String publication) {
			this.publication = publication;
			return this;
		}

		public Builder edition(String edition) {
			this.edition = edition;
			return this;
		}

		public Builder genre(String genre) {
			this.genre = genre;
			return this;
		}

		public Builder availableCount(int availableCount) {
			this.availableCount = availableCount;
			return this;
		}

		public Builder volume(int volume) {
			this.volume = volume;
			return this;
		}

		public Book build() {
			return new Book(this);
		}
	}

	@Override
	public String toString() {

		return "Book { " + id + " - " +
				name + " - " + author + " - " + publication + " - " + edition + " - " +
				genre + " - " + availableCount + " - " + " - " + volume + " }";
	}
}
