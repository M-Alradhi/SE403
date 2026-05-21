public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        // Add books
        library.addBook(new Book("Java"));
        library.addBook(new Book("Python"));

        User user = new User("Mariam");

        // Test cases
        System.out.println(library.borrowBook("Java", user));       // Success
        System.out.println(library.borrowBook("Java", user));       // Not available
        System.out.println(library.borrowBook("C++", user));        // Not found
        System.out.println(library.borrowBook("", user));           // Invalid title
        System.out.println(library.borrowBook("Python", null));     // Invalid user

        // Return book
        System.out.println(library.returnBook("Java"));
    }
}