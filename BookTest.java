package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookTest {

    Book book;

    @BeforeEach
    void setup() {
        book = new Book("Harry Potter");
    }

    @Test
    void testBookCreation() {
        assertEquals("Harry Potter", book.getTitle());
        assertTrue(book.isAvailable());
    }

    @Test
    void testBorrowBook() {
        book.borrow();
        assertFalse(book.isAvailable());
    }

    @Test
    void testToStringAvailable() {
        String result = book.toString();
        assertTrue(result.contains("✅"));
    }

    @Test
    void testToStringBorrowed() {
        book.borrow();
        String result = book.toString();
        assertTrue(result.contains("❌"));
    }
}
