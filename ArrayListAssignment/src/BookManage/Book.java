package BookManage;

public class Book {
    private String name;
    private int id;
    private String authorName;
    private int volume;
    private int edition;
    private String publication;

    public Book(String bookName, int bookId, String authorName, int bookPrice, int bookCount, String bookPublisher) {
        this.name = bookName;
        this.id = bookId;
        this.authorName = authorName;
        this.volume = bookPrice;
        this.edition = bookCount;
        this.publication = bookPublisher;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", id=" + id + ", authorName=" + authorName + ", volume=" + volume + ", edition="
				+ edition + ", publication=" + publication + "]";
	}
    
}
