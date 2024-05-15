package bookauth;

public abstract class Book {
	long id;
	String name;
	String author;
	String publications;

	public Book(long id, String name, String author, String publications) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publications = publications;
	}

	abstract boolean authorize(User user);

	abstract void setId(User user, long id) throws UnauthorizedException;

	abstract void setName(User user, String name) throws UnauthorizedException;

	abstract void setAuthor(User user, String name) throws UnauthorizedException;
	
	abstract void setPublications(User user,String publications) throws UnauthorizedException;

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public String getPublications() {
		return publications;
	}
}
