package sk.fei.ci.fei.rest.db;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This object represent in memory book database.
 */
public class BookDatabase {
    
    // In memory book database with initial state (4 books)
    private final Map<String, Book> bookDatabase = new HashMap<>();
    {
        bookDatabase.put("0544003411", new Book("0544003411", "The Lord of the Rings: The Fellowship of the Ring", "J.R.R Tolkien", 480));
        bookDatabase.put("0439136369", new Book("0439136369", "Harry Potter and the Prisoner of Azkaban", "J.K. Rowling", 448));
        bookDatabase.put("0439139600", new Book("0439139600", "Harry Potter And The Goblet Of Fire", "J.K. Rowling", 752));
        bookDatabase.put("0131872486", new Book("0131872486", "Thinking in Java (4th Edition)", "Bruce Eckel", 1150));
    }
    
    /**
     * Remove a book from DB.
     * @param isbn of the book that will be removed from database
     * @return true if book was removed or false if it was not present and therefore not removed.
     */
    public synchronized boolean removeBook(String isbn) {
        Book removedBook = bookDatabase.remove(isbn);
        return removedBook != null;
    }
    
    /**
     * Adds a book to DB.
     * @param newBook that will be added to database
     */
    public synchronized void addBook(Book newBook) {
        bookDatabase.put(newBook.getIsbn(), newBook);
    }
    
    /**
     * Get a single book from database by ISBN.
     * @param isbn
     * @return single book identified by ISBN. Null if there is no book with this ISBN in database.
     */
    public synchronized Book getBook(String isbn) {
        return bookDatabase.get(isbn);
    }
    
    /**
     * Get all books.
     * @return a list of {@link Book} objects. Empty list is returned if there is no book in database.
     */
    public synchronized List<Book> getAllBooks() {
        return new ArrayList(bookDatabase.values());
    }
    
}
