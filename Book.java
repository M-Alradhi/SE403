package test;

// ****************** Entity Layer ******************
// The (Book class) represents a single book in the library system.
// Each book has a title and an availability status.
//-------------------------------------------------------------------------

public class Book {
    private String title; // Title of the book
    private boolean available = true; // Availability status

    public Book(String title) { this.title = title; }  // Constructor: create a book with the given title, default = available

    public String getTitle() { return title; } // return the title of the book
    public boolean isAvailable() { return available; } // check if the book is available
    public void borrow() { available = false; }     //  mark the book as borrowed


    @Override
    public String toString() {
        return title + (available ? " ✅ Available" : " ❌ Borrowed");     // Return a readable description of the book

    }
}
