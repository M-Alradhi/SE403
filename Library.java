import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();

    // Add book
    public void addBook(Book book) {
        books.add(book);
    }

    // Borrow book
    public String borrowBook(String bookTitle, User user) {

        if (user == null) {
            return "Invalid user";
        }

        if (bookTitle == null || bookTitle.trim().isEmpty()) {
            return "Invalid book title";
        }

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(bookTitle)) {

                if (book.isAvailable()) {
                    book.borrow();
                    return "Book borrowed successfully by " + user.getName();
                } else {
                    return "Book is not available";
                }
            }
        }

        return "Book not found";
    }

    // Return book
    public String returnBook(String bookTitle) {

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(bookTitle)) {
                book.returnBook();
                return "Book returned successfully";
            }
        }

        return "Book not found";
    }
}