package test;
import java.util.*;

// ****************** Data Layer ******************
// The BookRepository class stores and manages the list of books.
// It provides a search function to find books by keyword.
//-------------------------------------------------------------------------

public class BookRepository {
    private List<Book> books = new ArrayList<>(); // List of books in the library

    // Constructor: initialize the "database" with some sample books
    public BookRepository() {
        books.add(new Book("Java Programming"));
        books.add(new Book("Data Structures"));
        books.add(new Book("Database Systems"));
        books.add(new Book("Operating Systems"));
        books.add(new Book("Software Engineering"));
    }

    // Method: search for books whose titles contain the given keyword
    // Case-insensitive search (ex: "java" matches "Java Programming")
    public List<Book> search(String keyword) {
        List<Book> results = new ArrayList<>();

        // handle null or empty input
        if (keyword == null || keyword.trim().isEmpty()) {
            return results;
        }

        String normalizedKeyword = keyword.toLowerCase().trim();

        for (Book b : books) {
            if (b.getTitle().toLowerCase().contains(normalizedKeyword)) {
                results.add(b);
            }
        }

        return results;
    }
}