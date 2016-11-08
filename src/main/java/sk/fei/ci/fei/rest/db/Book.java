package sk.fei.ci.fei.rest.db;

/**
 * Object representing a single book.
 * This object is stored in our in memory database and is returned by services.
 */
public class Book {
    
    private String isbn;
    private String title;
    private String author;
    private int numberOfPages;
    
    public Book() { }
    
    public Book(String isbn, String title, String author, int numberOfPages) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
    
    @Override
    public String toString() {
        return "Book{" + "isbn=" + isbn + ", title=" + title + ", author=" + author + ", numberOfPages=" + numberOfPages + '}';
    }

}
