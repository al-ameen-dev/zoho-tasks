package library.books;

public class Book {

	private long id;
	private String bookName;
	private String author;
	private long isbn;
	private String genre;
	private String publication;

	public Book() {

	}

	public Book(long id, String bookName, String author, long isbn, String genre, String publication) {
		this.id = id;
		this.bookName = bookName;
		this.author = author;
		this.isbn = isbn;
		this.genre = genre;
		this.publication = publication;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", author=" + author + ", isbn=" + isbn + ", genre="
				+ genre + ", publication=" + publication + "]";
	}

}
