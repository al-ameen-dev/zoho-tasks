import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/*
Add a constructor to the Book class alreday created.
Write a function to add books using constructors to an array of <Book> objects, and display all the books added.
 */
class Book {

    private long bookId;
    private String bookName;
    private long isbn;
    private String author;
    private String publisher;
    private int edition;
    private String genre;
    private String language;

    public Book() {

    }

    public Book(long bookId, String bookName, long isbn, String author, String publisher, int edition, String genre, String language) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.isbn = isbn;
        this.author = author;
        this.publisher = publisher;
        this.edition = edition;
        this.genre = genre;
        this.language = language;
    }

    public long getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public long getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getEdition() {
        return edition;
    }

    public String getGenre() {
        return genre;
    }

    public String getLanguage() {
        return language;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void display(List<Book> bookList){
        for(Book book:bookList){
            System.out.println(book);
        }
    }
    @Override
    public String toString() {
        return "Book {" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", isbn=" + isbn +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", edition=" + edition +
                ", genre='" + genre + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}

public class BookDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> bookList = new LinkedList<>();
        Book book = new Book(1,"the rose",2345638,"ameen","Mgrahill",3,"adventure","english" );
        bookList.add(book);
        book = new Book(2,"Titanic",234545655,"al ameen","mgrahill",2,"Romantic","English");
        bookList.add(book);
        book = new Book(3,"forever knights",2343534,"praveen","Books india",3,"Adventure","Tamil");
        bookList.add(book);
        book.display(bookList);
    }
}
