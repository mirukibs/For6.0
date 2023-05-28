package lab2;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class LibraryTest {

    @Test
    public void testAddBook() {
        Library library = new Library();
        library.addBook(new Book("Test Title", "Test Author", 12345, false));
        assertEquals(1, library.getAllBooks().size());
    }

    @Test
    public void testBorrowBook() {
        Library library = new Library();
        Book book1 = new Book("Book 1", "Author 1", 12345, false);
        Book book2 = new Book("Book 2", "Author 2", 67890, true);

        library.addBook(book1);
        library.addBook(book2);

        // Test borrowing a book that is not already borrowed
        boolean result1 = library.borrowBook(12345);
        Assert.assertTrue(result1);
        Assert.assertTrue(book1.getIsBorrowed());

        // Test borrowing a book that is already borrowed
        boolean result2 = library.borrowBook(12345);
        Assert.assertFalse(result2); // Expecting false since it's already borrowed
        Assert.assertTrue(book1.getIsBorrowed()); // Make sure the status is still borrowed

        // Test borrowing a book with an invalid ISBN
        boolean result3 = library.borrowBook(98765);
        Assert.assertFalse(result3); // Expecting false since the book is not found
    }

    @Test
    public void testReturnBook() {
        Library library = new Library();
        Book book = new Book("Book", "Author", 12345, true);

        library.addBook(book);
        library.borrowBook(12345);

        // Test returning a book that was borrowed
        boolean result1 = library.returnBook(12345);
        Assert.assertTrue(result1);
        Assert.assertFalse(book.getIsBorrowed());

        // Test returning a book that was already returned
        boolean result2 = library.returnBook(12345);
        Assert.assertFalse(result2); // Expecting false since it was already returned
        Assert.assertFalse(book.getIsBorrowed()); // Make sure the status is still not borrowed

        // Test returning a book with an invalid ISBN
        boolean result3 = library.returnBook(98765);
        Assert.assertFalse(result3); // Expecting false since the book is not found
    }

    @Test
    public void testGetAvailableBooks() {
        Library library = new Library();
        library.addBook(new Book("Test Title 1", "Test Author 1", 12345, true));
        library.addBook(new Book("Test Title 2", "Test Author 2", 67890, false));
        library.borrowBook(12345);
        ArrayList<Book> availableBooks = library.getAvailableBooks();
        assertEquals(1, availableBooks.size());
        assertEquals(67890, availableBooks.get(0).getIsbn());
    }
}