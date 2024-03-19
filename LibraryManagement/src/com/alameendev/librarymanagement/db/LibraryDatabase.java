package com.alameendev.librarymanagement.db;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.alameendev.librarymanagement.model.Admin;
import com.alameendev.librarymanagement.model.Book;
import com.alameendev.librarymanagement.model.Credentials;
import com.alameendev.librarymanagement.model.Customer;
import com.alameendev.librarymanagement.model.IssuedBooks;
import com.alameendev.librarymanagement.model.Library;

public class LibraryDatabase {

	private static LibraryDatabase libraryDatabase;

	private Library library;
	private Admin admin;
	private List<Book> bookList = new ArrayList<>();
	private List<Credentials> credentialsList = new ArrayList<>();
	private List<Customer> customerList = new ArrayList<>();
	private List<IssuedBooks> issuedBooksList = new ArrayList<>();

	public static LibraryDatabase getInstance() {
		if (libraryDatabase == null) {
			libraryDatabase = new LibraryDatabase();
		}
		return libraryDatabase;
	}

	public void updateLibrary(Library library){
		this.library = library;
	}

	public Library getLibrary(){
		return library;
	}

	public Book getBook(int bookId){
		for(Book book:bookList){
			if(book.getId()==bookId){
				return book;
			}
		}
		return null;
	}

	// Adds book to the books list.
	public void addBook(Book book) {
		bookList.add(book);
	}

	// Deletes book from the books list.
	public void deleteBook(int id) {
		bookList.removeIf(book -> book.getId() == id);
	}

	// List all books from the books list.
	public List<Book> listBooks() {
		return bookList;
	}

	// Adds credentials to the credentials list.
	public void addCredentials(Credentials credentials) {
		credentialsList.add(credentials);
	}

	// Delete credentials from the credentials list.
	public void deleteCredentials(int id) {
		credentialsList.removeIf(cred -> cred.getId() == id);
	}

	// Adds customer to the customer list.
	public void addCustomer(Customer customer) {
		customerList.add(customer);
	}
	// return the customer if present.
	public boolean isCustomerPresent(int customerId){
		Optional<Customer> customer = customerList.stream().filter(cust->cust.getCustomerId()==customerId).findFirst();
		return customer.isPresent();
	}

	public boolean isBookPresent(int bookId){
		Optional<Book> book = bookList.stream().filter(bk->bk.getId()==bookId).findFirst();
		return book.isPresent();
	}
	// Delete customer from the customer list.
	public void deleteCustomer(int id) {
		customerList.removeIf(customer -> customer.getCustomerId() == id);
	}

	// Returns the customers list.
	public List<Customer> getAllCutomers() {
		return customerList;
	}

	// Adds IssuedBooks to the issued book list.
	public void addIssuedBook(IssuedBooks issuedBook) {
		issuedBooksList.add(issuedBook);
	}

	// Delete IssuedBook from the issued book list.
	public void deleteIssuedBook(int issuedBookid, int bookId) {
		issuedBooksList.removeIf(issued -> issued.getId() == issuedBookid && issued.getBookId() == bookId);
	}

	// Get the IssuedBooks list.
	public List<IssuedBooks> getAllIssuedBooks() {
		return issuedBooksList;
	}

	// Get all overdue Books.
	public List<IssuedBooks> getOverDueBooks(Date dueDate) {
		return issuedBooksList.stream().filter(issued -> issued.getDueDate().before(dueDate)).toList();
	}

	// Get Over due books for specific customer.
	public List<IssuedBooks> getOverDueBooksForCustomer(int customerId, Date dueDate) {
		return issuedBooksList.stream().filter(issued -> issued.getDueDate().before(dueDate))
				.filter(issued -> issued.getCustomerId() == customerId).toList();
	}

	// Get books from the disk if available.
	public void getBooksFromTheDisk() throws IOException {
		FileInputStream fileInputStream = new FileInputStream("booklist");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		try {
			bookList = (List<Book>) objectInputStream.readObject();
		} catch (ClassNotFoundException e) {
		}
		objectInputStream.close();
		fileInputStream.close();
	}

	// Save the list to the disk.
	public void saveBookListToDisk() throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream("booklist");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		try {
			objectOutputStream.writeObject(bookList);
		} catch (IOException e) {
			e.printStackTrace();
		}
		objectOutputStream.close();
		fileOutputStream.close();
	}
	

    public Admin getAdmin() {
        return admin;
    }

    public void createAdmin(String name,String password) {
		this.admin = new Admin(name, password);
    }
}
