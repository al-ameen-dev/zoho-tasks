package product;

public class BookProduct extends Product {

	private String author;
	private int pageCount;

	public BookProduct(String name, double price, String author, int pageCount) {
		super(name, price);
		this.author = author;
		this.pageCount = pageCount;
	}

	@Override
	public String getDescription() {
		return "Book: " + getName() + " - Author: " + getAuthor() + " - Page Count: " + getPageCount();
	}

	public void read() {
		System.out.println("Reading " + getName());
	}

	public String getAuthor() {
		return author;
	}
	
	public int getPageCount() {
		return pageCount;
	}
}
