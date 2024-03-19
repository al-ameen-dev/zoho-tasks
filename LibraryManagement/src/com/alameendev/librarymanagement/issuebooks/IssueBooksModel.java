package com.alameendev.librarymanagement.issuebooks;

import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import com.alameendev.librarymanagement.db.LibraryDatabase;
import com.alameendev.librarymanagement.model.Book;
import com.alameendev.librarymanagement.model.IssuedBooks;

public class IssueBooksModel {

    private IssueBooksView issueBooksView;

    IssueBooksModel(IssueBooksView issueBooksView) {
        this.issueBooksView = issueBooksView;
    }

    public boolean checkCustomer(int customerId){
        return LibraryDatabase.getInstance().isCustomerPresent(customerId);
    }

    public boolean checkBook(int bookId){
        return LibraryDatabase.getInstance().isBookPresent(bookId);
    }
    public void addIssuedBook(int customerId, int bookId, String dueDate) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        Date parsedDueDate,issuedDate;
        try {
            LocalDateTime userLocalTime = LocalDateTime.parse(dueDate,dateTimeFormatter);
            LocalDateTime issuedUserLocalDateTime = LocalDateTime.now();
            issuedDate = toDate(issuedUserLocalDateTime);
            //Date.from(issuedUserLocalDateTime.atZone(ZoneId.systemDefault()).toInstant());
            parsedDueDate = toDate(userLocalTime);
            //Date.from(userLocalTime.atZone(ZoneId.systemDefault()).toInstant());
            IssuedBooks issuedBook = new IssuedBooks.Builder().customerId(customerId).bookid(bookId).issuedDate(issuedDate)
                    .dueDate(parsedDueDate).Build();
            LibraryDatabase.getInstance().addIssuedBook(issuedBook);
            if(LibraryDatabase.getInstance().getBook(bookId) != null){
                LibraryDatabase.getInstance().getBook(bookId).deductAvailableCount();
            }
        } catch(Exception e) {
            issueBooksView.showAlert("Invalid date and time format,Please enter in specified format!");
        }
    }

    public Date toDate(LocalDateTime localDateTime){
        return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
    }

    public LocalDateTime toLocalDateTime(Date date){
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    }

    public List<IssuedBooks> getIssuedBooksList() {
        if(LibraryDatabase.getInstance().getAllIssuedBooks().size() ==0){
            issueBooksView.showAlert("Currently no books issued!");
        }
        return LibraryDatabase.getInstance().getAllIssuedBooks();
    }

    public List<IssuedBooks> getOverDueBooksList() {
        LocalDateTime localDateTime = LocalDateTime.now();
        Date now = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
        if(LibraryDatabase.getInstance().getOverDueBooks(now).size()==0){
            issueBooksView.showAlert("The library doesnt have any overduebooks!");
        }
        return LibraryDatabase.getInstance().getOverDueBooks(now);
    }

    public List<IssuedBooks> getOverDueBooksListForCustomert(int customerId){
        LocalDateTime localDateTime = LocalDateTime.now();
        Date now = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
        if(LibraryDatabase.getInstance().getOverDueBooksForCustomer(customerId,now).size()==0){
            issueBooksView.showAlert("The user doesnt have any overdue books!");
        }
        return LibraryDatabase.getInstance().getOverDueBooksForCustomer(customerId, now);
    }

    public void deleteIssuedBook(int customerId,int bookId) {
        if(LibraryDatabase.getInstance().getAllIssuedBooks().size() ==0){
            issueBooksView.showAlert("There is no Books issued to reclaim!");
            return;
        }
        LibraryDatabase.getInstance().deleteIssuedBook(customerId,bookId);
        LibraryDatabase.getInstance().getBook(bookId).increaseAvailableCount();
    }

    // public int bookAvailableCount(int bookid) {
    //     return LibraryDatabase.getInstance().getAvailableBookCount(bookid);
    // }

}
