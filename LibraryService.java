package test;

import java.util.List;
// ****************** Business Layer ******************
// The LibraryService class contains the business logic for searching books.
// It communicates with the Data Layer (BookRepository) and formats results.
//-------------------------------------------------------------------------


public class LibraryService {
    private BookRepository repo = new BookRepository(); // Access to the data layer

    // Search books by keyword
    public void searchBook(String keyword) {
        List<Book> found = repo.search(keyword); // Get results
        if (found.isEmpty()) { // No matches
            System.out.println(" No books found for: " + keyword);

        } else { // Matches found
            System.out.println(" Results for \"" + keyword + "\":");
            int i = 1;
            for (Book b : found) // Loop through each found book
                System.out.println(" " + (i++) + ". " + b);// Print result number + book details
        }
    }
}
