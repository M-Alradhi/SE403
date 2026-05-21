import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();

    public String addBook(Book book) {

        if (book == null) {
            return "Invalid book";
        }

        if (book.getTitle() == null || book.getTitle().trim().isEmpty()) {
            return "Invalid book title";
        }

        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(book.getTitle())) {
                return "Book already exists";
            }
        }

        books.add(book);
        return "Book added successfully";
    }

    public int getBookCount() {
        return books.size();
    }
}
