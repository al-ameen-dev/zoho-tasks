package com.alameendev.librarymanagement.managebook;

import java.util.List;

import com.alameendev.librarymanagement.db.LibraryDatabase;
import com.alameendev.librarymanagement.model.Book;

public class ManageBookModel {

	private ManageBookView manageBookView;

	public ManageBookModel(ManageBookView manageBookView) {
		this.manageBookView = manageBookView;
	}

	// Add books to the booklist.
	public void updateBookList(String name,String author, String publication, String edition, String genre,
			int availableCount, int volume) {
		Book book = new Book.Builder().name(name).author(author).publication(publication).edition(edition)
				.genre(genre).volume(volume).availableCount(availableCount).build();

		LibraryDatabase.getInstance().addBook(book);
	}

	// Return the list of the books available.
	public List<Book> getAllBooks() {
		return LibraryDatabase.getInstance().listBooks();
	}

	// Delete the books from the book list.
	public void deleteBookFromTheList(int id) {
		if(LibraryDatabase.getInstance().listBooks().size()==0){
			manageBookView.showAlert("There is no book in the library to delete");
			return;
		}
		LibraryDatabase.getInstance().deleteBook(id);
	}
	
	// Stock update.
	public void updateStock(int bookId,int newBooks){
		if(!LibraryDatabase.getInstance().isBookPresent(bookId)){
			manageBookView.showAlert("There is no book in the Id "+bookId);
			return;
		}
		LibraryDatabase.getInstance().getBook(bookId).updateStock(newBooks);
	}

	// Searching books by title
	public List<Book> getBooksByTitle(String title){
		return LibraryDatabase.getInstance().listBooks().stream().filter(book->book.getName().startsWith(title)).toList();
	}

}