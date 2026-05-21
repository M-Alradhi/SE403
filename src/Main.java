import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        library.addBook(new Book("Java"));
        library.addBook(new Book("Python"));
        library.addBook(new Book("Data Structures"));

        System.out.println("=========================================");
        System.out.println("   Online Library Management System");
        System.out.println("=========================================");
        System.out.println("Available books: Java, Python, Data Structures");
        System.out.println();

        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();
        User user = new User(userName);

        System.out.print("Enter book title to borrow: ");
        String bookTitle = scanner.nextLine();

        String borrowResult = library.borrowBook(bookTitle, user);
        System.out.println("Result: " + borrowResult);

        System.out.println();
        System.out.print("Enter book title to return: ");
        String returnTitle = scanner.nextLine();

        String returnResult = library.returnBook(returnTitle);
        System.out.println("Result: " + returnResult);

        scanner.close();
    }
}
