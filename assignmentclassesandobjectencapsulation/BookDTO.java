public class BookDTO {

    private long bookId;
    private String bookName;
    private long isbn;
    private String author;
    private String publisher;
    private int edition;
    private String genre;
    private String language;

    public BookDTO() {

    }

    public BookDTO(long bookId, String bookName, long isbn, String author, String publisher, int edition, String genre, String language) {
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

    @Override
    public String toString() {
        return "BookDTO{" +
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
