package library;

import java.time.LocalDateTime;

import library.books.Book;
import library.members.StudentMember;
import library.transactions.Transaction;
import library.members.Member;

/*
Design a library management system using packages. Create packages such as library.books , library.members , and library.transactions .
Implement classes within these packages to represent books, members, and transactions.
Demonstrate the usage of packages to organize the code logically.
 */
public class Main {
	public static void main(String[] args) {
		Book book = new Book(1,"i am legend","ameen",84848484,"thriller","mgrahill");
		Member student = new StudentMember(1,"mark zuckerberg","mark@facebook.com","america");
		Transaction transaction = new Transaction(book, student, LocalDateTime.now());
		System.out.println(transaction);
	}
}
