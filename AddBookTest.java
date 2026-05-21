import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AddBookTest {

    private Library library;

    @BeforeEach
    public void setUp() {
        library = new Library();
    }

    @Test
    public void TC01_AddValidBook() {
        String result = library.addBook(new Book("Java"));
        assertEquals("Book added successfully", result);
    }

    @Test
    public void TC02_AddDuplicateBook() {
        library.addBook(new Book("Java"));
        String result = library.addBook(new Book("Java"));
        assertEquals("Book already exists", result);
    }

    @Test
    public void TC03_AddBookWithNullTitle() {
        String result = library.addBook(new Book(null));
        assertEquals("Invalid book title", result);
    }

    @Test
    public void TC04_AddBookWithEmptyTitle() {
        String result = library.addBook(new Book(""));
        assertEquals("Invalid book title", result);
    }

    @Test
    public void TC05_AddBookWithWhitespaceTitle() {
        String result = library.addBook(new Book("   "));
        assertEquals("Invalid book title", result);
    }

    @Test
    public void TC06_AddMultipleValidBooks() {
        library.addBook(new Book("Java"));
        String result = library.addBook(new Book("Python"));
        assertEquals("Book added successfully", result);
    }

    @Test
    public void TC07_AddNullBookObject() {
        String result = library.addBook(null);
        assertEquals("Invalid book", result);
    }

    @Test
    public void TC08_VerifyBookCountAfterAdding() {
        library.addBook(new Book("Java"));
        library.addBook(new Book("Python"));
        assertEquals(2, library.getBookCount());
    }
}