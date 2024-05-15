package bookauth;

public class LibraryBook extends Book {

	public LibraryBook(long id, String name, String author, String publications) {
		super(id, name, author, publications);
	}

	@Override
	boolean authorize(User user) {
		if ("libraryAdmin".equals(user.getRole())) {
			return true;
		}
		return false;
	}

	@Override
	void setId(User user, long id) throws UnauthorizedException {
		if (authorize(user)) {
			this.id = id;
		} else {
			throw new UnauthorizedException("You dont have permission to modify this information!");
		}
	}

	@Override
	void setName(User user, String name) throws UnauthorizedException {
		if (authorize(user)) {
			this.name = name;
		} else {
			throw new UnauthorizedException("You dont have permission to modify this information!");
		}
	}

	@Override
	void setAuthor(User user, String author) throws UnauthorizedException {
		if (authorize(user)) {
			this.author = author;
		} else {
			throw new UnauthorizedException("You dont have permission to modify this information!");
		}
	}

	@Override
	void setPublications(User user, String publications) throws UnauthorizedException {
		if (authorize(user)) {
			this.publications = publications;
		} else {
			throw new UnauthorizedException("You dont have permission to modify this information!");
		}

	}

	@Override
	public String toString() {
		return "LibraryBook [ id=" + id + ", name=" + name + ", author=" + author
				+ ", publications=" + publications + " ]";
	}
}
