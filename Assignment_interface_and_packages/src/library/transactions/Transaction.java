package library.transactions;

import java.time.LocalDateTime;

import library.books.Book;
import library.members.Member;

public class Transaction {
	Book book;
	Member member;
	LocalDateTime issuedDate;

	public Transaction() {

	}
	
	public Transaction(Book book,Member member,LocalDateTime issuedDate) {
		this.book = book;
		this.member = member;
		this.issuedDate = issuedDate;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Member getMember() {
		return member;
	}

	public void setIssuedDate(LocalDateTime issuedDate) {
		this.issuedDate = issuedDate;
	}
	
	public LocalDateTime getIssuedDate() {
		return issuedDate;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	@Override
	public String toString() {
		return "Transaction [book=" + book + ", member=" + member + ", issuedDate=" + issuedDate + "]";
	}
	
	
	
}
