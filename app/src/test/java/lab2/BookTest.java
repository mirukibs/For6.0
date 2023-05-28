package lab2;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void testBook() {
        Book book = new Book("Test Title", "Test Author", 12345, false);
        assertEquals("Test Title", book.getTitle());
        assertEquals("Test Author", book.getAuthor());
        assertEquals(12345, book.getIsbn());
        assertFalse(book.getIsBorrowed());
    }

    @Test
    public void testBorrowed() {
        Book book = new Book("Test Title", "Test Author", 12345, true);
        book.setIsBorrowed(true);
        assertTrue(book.getIsBorrowed());
    }

    @Test
    public void testToString() {
        Book book = new Book("Test Title", "Test Author", 12345, true);
        assertEquals("Title: Test Title, Author: Test Author, ISBN: 12345", book.toString());
    }
}