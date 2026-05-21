package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

// ******************************************************
// ITSE403 - Software Testing Project
// Search Book Functionality Testing
// ******************************************************

class BookRepositoryTest {

    BookRepository repo;

    @BeforeEach
    void setup() {
        repo = new BookRepository();
    }

    // ================= EXISTING TESTS =================

    @Test
    void testSearchExistingBook() {
        List<Book> results = repo.search("Java Programming");
        assertNotNull(results);
        assertFalse(results.isEmpty());
        assertEquals("Java Programming", results.get(0).getTitle());
    }

    @Test
    void testSearchNonExistingBook() {
        List<Book> results = repo.search("Invisible Book");
        assertNotNull(results);
        assertTrue(results.isEmpty());
    }

    // ================= NEW TESTS (ITSE403 REQUIREMENT) =================
    // These tests are added for Software Testing course project

    // Test case: Case-insensitive search
    @Test
    void testSearchCaseInsensitive() {
        List<Book> results = repo.search("java");
        assertFalse(results.isEmpty());
        assertEquals("Java Programming", results.get(0).getTitle());
    }

    // Test case: Partial keyword search
    @Test
    void testSearchPartialKeyword() {
        List<Book> results = repo.search("Data");
        assertFalse(results.isEmpty());
    }

    // Test case: Empty input
    @Test
    void testSearchEmptyKeyword() {
        List<Book> results = repo.search("");
        assertTrue(results.isEmpty());
    }

    // Test case: Null input
    @Test
    void testSearchNullKeyword() {
        List<Book> results = repo.search(null);
        assertTrue(results.isEmpty());
    }

    // Test case: Keyword with extra spaces
    @Test
    void testSearchWithSpaces() {
        List<Book> results = repo.search("   Java   ");
        assertFalse(results.isEmpty());
        assertEquals("Java Programming", results.get(0).getTitle());
    }

}