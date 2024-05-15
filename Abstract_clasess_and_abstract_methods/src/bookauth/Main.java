package bookauth;

/*
In the book class, add methods to prevent unauthorized modification of book information.
Clue: Use login to check authorized personal while updating book details.
 */
public class Main {
	public static void main(String[] args) {
		User ameen = new User("al ameen","123","libraryAdmin");
		User praveen = new User("jothi Praveen","123","schoolAdmin");
		Book librarybook = new LibraryBook(1, "Harry Potter", "Jk Rowling", "Warner Bro's");
		
		System.out.println("\n\nBefore modifying the book details:\n\n");
		System.out.println(librarybook);
		try {
			librarybook.setAuthor(ameen, "Al ameen");
		} catch (UnauthorizedException e) {
			System.out.println("\nThis is custom exception!\n");
			e.printStackTrace();
		}
		
		System.out.println("\n\nAfter modifying the book details:\n\n");
		System.out.println(librarybook);
		
		System.out.println("\n\nTrying to modify the book details with unauthorized user:\n\n");
		try {
			librarybook.setPublications(praveen, "Praveen publicaions limited");
		} catch (UnauthorizedException e) {
			System.out.println("\nThis is custom exception!\n");
			e.printStackTrace();
		}
	}
}
