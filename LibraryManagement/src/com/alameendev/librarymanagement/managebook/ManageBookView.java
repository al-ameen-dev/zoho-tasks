package com.alameendev.librarymanagement.managebook;

import java.util.Scanner;

import com.alameendev.librarymanagement.login.LoginView;
import com.alameendev.librarymanagement.model.Book;

import java.util.List;

public class ManageBookView {

	private ManageBookModel manageBookModel;
	private LoginView loginView;

	public ManageBookView() {
		manageBookModel = new ManageBookModel(this);
		loginView = new LoginView();
	}

	// Menu for Managing Books.
	public void showManageBookMenu() {
		Scanner scanner = new Scanner(System.in);
		exit: while (true) {
			System.out.printf("%nManage Books Menu   : 1 %-5s| 2 %-5s| 3 %-5s| 4 %-5s| 5 %-5s| 6 %-5s| 7 %-5s%n", "Add Book",
					"Show Books", "Search Books","Update stocks", "Delete Book", "Logout", "Go Back");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				this.addBook();
				break;
			case 2:
				this.listBooks();
				break;
			case 3:
				this.searchBooksByTitle();
				break;
			case 4:
				this.stockUpdate();
				break;
			case 5:
				this.deleteBookById();
				break;
			case 6:
				System.out.println("Loged out Successfully");
				loginView.init();
				return;
			case 7:
				break exit;
			default:
				System.out.println("Enter a valid option!");
				break;
			}
		}
	}

	private void stockUpdate() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the book Id:");
		int bookid = scanner.nextInt();
		System.out.print("Enter the new books count:");
		int newBooks = scanner.nextInt();
		manageBookModel.updateStock(bookid, newBooks);
	}

	// This method is used to get the book information from the user.
	public void addBook() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("---Enter the books to the library---");
		System.out.print("Enter the Bookname:");
		String name = scanner.nextLine();
		System.out.print("Enter the author:");
		String author = scanner.nextLine();
		System.out.print("Enter the publication:");
		String publication = scanner.nextLine();
		System.out.print("Enter the edition:");
		String edition = scanner.next();
		System.out.print("Enter the genre:");
		String genre = scanner.next();
		System.out.print("Enter the no of Books available:");
		int availableCount = scanner.nextInt();
		System.out.print("Enter the volume:");
		int volume = scanner.nextInt();
		manageBookModel.updateBookList(name, author, publication, edition, genre, availableCount, volume);
	}

	// This method will get the book id from the user.
	public void deleteBookById() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the id of the book to delete:");
		int id = scanner.nextInt();
		manageBookModel.deleteBookFromTheList(id);
	}

	// Search the books by title.
	public void searchBooksByTitle() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the title to search:");
		String title = scanner.nextLine();
		List<Book> bookList = manageBookModel.getBooksByTitle(title);
		this.showBookTable(bookList);

	}

	// This method print book in a formatted table
	public void showBookTable(List<Book> bookList) {
		if (bookList.size() == 0) {
			System.out.println("Currently there is no book in the library. Add some books");
		} else {
			System.out.printf("%n%-5s|%-15s|%-15s|%-15s|%-15s|%-15s|%-15s|%-15s%n", "Id", "Book Name", "Author",
					"Publication", "Edition", "Genre", "Volume","Books available");
			for (Book book : bookList) {
				System.out.printf("%n%-5d|%-15s|%-15s|%-15s|%-15s|%-15S|%-15d|%-15d%n", book.getId(), book.getName(),
						book.getAuthor(), book.getPublication(), book.getEdition(), book.getGenre(), book.getVolume(),book.getAvailableCount());
			}
		}
	}

	// This method list the books.
	public void listBooks() {
		List<Book> bookList = manageBookModel.getAllBooks();
		this.showBookTable(bookList);
	}

	public void showAlert(String alert) {
		System.out.println(alert);
	}
}
