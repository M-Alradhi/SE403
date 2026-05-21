import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println("   Online Library Management System");
        System.out.println("=========================================");

        String choice = "yes";
        while (choice.equalsIgnoreCase("yes")) {

            System.out.print("Enter book title to add: ");
            String bookTitle = scanner.nextLine();

            String result = library.addBook(new Book(bookTitle));
            System.out.println("Result: " + result);
            System.out.println("Total books in library: " + library.getBookCount());

            System.out.println();
            System.out.print("Add another book? (yes/no): ");
            choice = scanner.nextLine();
        }

        System.out.println("=========================================");
        System.out.println("Final total books: " + library.getBookCount());
        scanner.close();
    }
}
