import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BorrowBookTest {

    private Library library;
    private User user;

    @BeforeEach
    public void setUp() {
        library = new Library();
        library.addBook(new Book("Java"));
        library.addBook(new Book("Python"));
        user = new User("Mariam");
    }

    @Test
    public void TC01_BorrowAvailableBook() {
        String result = library.borrowBook("Java", user);
        assertEquals("Book borrowed successfully by Mariam", result);
    }

    @Test
    public void TC02_BorrowAlreadyBorrowedBook() {
        library.borrowBook("Java", user);
        String result = library.borrowBook("Java", user);
        assertEquals("Book is not available", result);
    }

    @Test
    public void TC03_BorrowNonExistentBook() {
        String result = library.borrowBook("C++", user);
        assertEquals("Book not found", result);
    }

    @Test
    public void TC04_BorrowWithEmptyTitle() {
        String result = library.borrowBook("", user);
        assertEquals("Invalid book title", result);
    }

    @Test
    public void TC05_BorrowWithNullUser() {
        String result = library.borrowBook("Python", null);
        assertEquals("Invalid user", result);
    }

    @Test
    public void TC06_BorrowAfterReturn() {
        library.borrowBook("Java", user);
        library.returnBook("Java");
        String result = library.borrowBook("Java", user);
        assertEquals("Book borrowed successfully by Mariam", result);
    }

    @Test
    public void TC07_BorrowWithNullTitle() {
        String result = library.borrowBook(null, user);
        assertEquals("Invalid book title", result);
    }

    @Test
    public void TC08_BorrowWithWhitespaceTitle() {
        String result = library.borrowBook("   ", user);
        assertEquals("Invalid book title", result);
    }
}
