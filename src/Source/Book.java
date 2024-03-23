package Source;
import java.io.Serializable;

public class Book implements Serializable {
    private int bookId;
    private String bookTitle;
    private String bookAuthor;
    private String bookPublisher;
    private String bookCategory;
    private String bookDescription;
    private int bookStatus;
    private String bookDateAdded;
    private String bookDateModified;

    public Book(int bookId, String bookTitle, String bookAuthor, String bookPublisher, String bookCategory, String bookDescription, String bookDateAdded, String bookDateModified) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookPublisher = bookPublisher;
        this.bookCategory = bookCategory;
        this.bookDescription = bookDescription;
        this.bookStatus = 1;
        this.bookDateAdded = bookDateAdded;
        this.bookDateModified = bookDateModified;
    }
    //getters and setters
    public int getBookId() {
        return bookId;
    }
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    public String getBookTitle() {
        return bookTitle;
    }
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
    public String getBookAuthor() {
        return bookAuthor;
    }
    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
    public String getBookPublisher() {
        return bookPublisher;
    }
    public void setBookPublisher(String bookPublisher) {
        this.bookPublisher = bookPublisher;
    }
    public String getBookCategory() {
        return bookCategory;
    }
    public void setBookCategory(String bookCategory) {
        this.bookCategory = bookCategory;
    }
    public String getBookDescription() {
        return bookDescription;
    }
    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }
    public int getBookStatus() {
        return bookStatus;
    }
    public void setBookStatus(int bookStatus) {
        this.bookStatus = bookStatus;
    }
    public String getBookDateAdded() {
        return bookDateAdded;
    }
    public void setBookDateAdded(String bookDateAdded) {
        this.bookDateAdded = bookDateAdded;
    }
    public String getBookDateModified() {
        return bookDateModified;
    }
    public void setBookDateModified(String bookDateModified) {
        this.bookDateModified = bookDateModified;
    }

}
