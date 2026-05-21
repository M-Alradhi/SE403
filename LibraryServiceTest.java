package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class LibraryServiceTest {

    LibraryService service;
    ByteArrayOutputStream output;

    @BeforeEach
    void setup() {
        service = new LibraryService();
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @Test
    void testSearchExistingBookOutput() {
        service.searchBook("Java");
        String result = output.toString();
        assertTrue(result.contains("Java Programming"));
    }

    @Test
    void testSearchNonExistingBookOutput() {
        service.searchBook("RandomName");
        String result = output.toString();
        assertTrue(result.contains("No books found"));
    }

    @Test
    void testMultipleResultsOutput() {
        service.searchBook("Systems");
        String result = output.toString();
        assertTrue(result.contains("Database Systems"));
        assertTrue(result.contains("Operating Systems"));
    }
}
