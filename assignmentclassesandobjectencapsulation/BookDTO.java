package assignmentClassesAndObject;

/*
Create Book DTO class with attributes like title, ISBN etc.
Create appropriate instance variables, static variables and methods with appropriate access modifiers.
 */

class BookDTO {
	private String title;
	private long isbn;
	private int price;
	private String authorName;

	public BookDTO(){}
	public BookDTO(String title, long isbn, int price, String authorName) {
		this.title = title;
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	@Override
	public String toString() {
		return "BookDTO{" +
				"title='" + title + '\'' +
				", isbn=" + isbn +
				", price=" + price +
				", authorName='" + authorName + '\'' +
				'}';
	}
}