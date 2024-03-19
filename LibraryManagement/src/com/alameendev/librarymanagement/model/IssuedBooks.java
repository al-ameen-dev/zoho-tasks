package com.alameendev.librarymanagement.model;

import java.util.Date;

public class IssuedBooks {
    private static int uniqueId;
    private int id;
    private int customerId;
    private int bookId;
    private Date issuedDate;
    private Date dueDate;

    static {
        uniqueId = 1;
    }

    public IssuedBooks(Builder builder) {
        this.id = uniqueId++;
        this.bookId = builder.bookId;
        this.customerId = builder.customerId;
        this.issuedDate = builder.issuedDate;
        this.dueDate = builder.dueDate;
    }

    public int getId() {
        return id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getBookId() {
        return bookId;
    }

    public Date getIssuedDate() {
        return issuedDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public static class Builder {
        private int customerId;
        private int bookId;
        private Date issuedDate;
        private Date dueDate;

        public Builder customerId(int customerId) {
            this.customerId = customerId;
            return this;
        }

        public Builder bookid(int bookId) {
            this.bookId = bookId;
            return this;
        }

        public Builder issuedDate(Date issuedDate) {
            this.issuedDate = issuedDate;
            return this;
        }

        public Builder dueDate(Date dueDate) {
            this.dueDate = dueDate;
            return this;
        }

        public IssuedBooks Build() {
            return new IssuedBooks(this);
        }
    }

    @Override
    public String toString() {
        return "{Issued Book +" + id + " customer id " + customerId + " book id " + bookId + "}";
    }
}
