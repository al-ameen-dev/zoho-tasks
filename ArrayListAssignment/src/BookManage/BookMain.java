package BookManage;

import java.util.ArrayList;
import java.util.List;

/*
Create ArrayList of the book class (ArrayList<Book>) in main method. Add methods to add books to the ArrayList.
Write methods to update/delete a particular book in the above ArrayList.
 */
public class BookMain {
	List<Book> bookList = new ArrayList<>();

	public void addBook(int id, String name, String authorName, int volume, int edition, String publication) {
		Book book = new Book(name, id, authorName, volume, edition, publication);
		bookList.add(book);
	}

	public void updateBook(int id, String name, String authorName, int volume, int edition, String publication) {
		for (Book book : bookList) {
			if (book.getId() == id) {
				book.setAuthorName(authorName);
				book.setName(authorName);
				book.setVolume(volume);
				book.setEdition(edition);
				book.setPublication(publication);
			}
		}
	}

	public void deleteBook(int id) {
		bookList.removeIf(book -> book.getId() == id);
	}
	
	public List<Book> listBooks(){
		return bookList;
	}

	public static void main(String[] args) {
		BookMain bookMain = new BookMain();
		bookMain.addBook(1, "left 4 dead", "jack sparrow", 1, 2, "Disney");
		bookMain.addBook(2, "Aladin", "warner", 1, 1, "warner bros");
		bookMain.addBook(3, "resident evil", "yutoshi matasha", 1, 2, "capcom");
		bookMain.addBook(4, "Harry potter", "jk rowling", 1, 4, "warner bros");
		bookMain.updateBook(3,"resident evil","al ameen",2,2,"capcom");
		
		List<Book> list =  bookMain.listBooks();
		
		for(Book book: list) {
			System.out.println(book);
		}
		bookMain.deleteBook(1);
		list = bookMain.listBooks();
		System.out.println("After deleting the book:");
		for(Book book: list) {
			System.out.println(book);
		}
		

	}
}
