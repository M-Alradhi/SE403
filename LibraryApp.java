package test;

import java.util.Scanner;
// ****************** Presentation Layer ******************
// The LibraryApp class interacts with the user.
// It asks the user for a keyword, passes it to the service, and shows results.
//-------------------------------------------------------------------------
public class LibraryApp {
    public static void main(String[] args) {
        LibraryService service = new LibraryService(); // Business logic
        Scanner sc = new Scanner(System.in);

        System.out.println("**************** Welcome to the Library Search System! ****************");

        // (loop) keep asking the user until they type 'exit'
        while (true) {
            System.out.print("\nEnter keyword (or 'exit' to quit): ");
            String keyword = sc.nextLine();

            if (keyword.equalsIgnoreCase("exit")) { // If user types "exit", stop the program

                System.out.println("Goodbye!");
                break;
            }
            // Otherwise , search for books
            service.searchBook(keyword);
        }
        sc.close();
    }
}
