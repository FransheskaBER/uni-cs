package exercises;

import java.util.Set;

public class LibraryMain {
    public static void main(String[] args) {

        // Create library
        Library library1 = new Library();
        System.out.println("");
        
        // Add 4 books
        System.out.println("Adding books to Library 1...");
        library1.addBook(new Book("123", "Java Basics", "Smith"));
        library1.addBook(new Book("456", "Data Structures", "Jones"));
        library1.addBook(new Book("789", "Algorithms", "Brown"));
        library1.addBook(new Book("321", "Database Design", "Wilson"));
        System.out.println("");
        
        System.out.println("\nLibrary 1 Catalog:");
        library1.printCatalog();
        System.out.println("Total books: " + library1.getBookCount());
        System.out.println("");
        
        // Try adding duplicate
        System.out.println("\nAttempting to add duplicate (ISBN: 123)...");
        boolean added = library1.addBook(new Book("123", "Java Basics", "Smith"));
        if (!added) {
            System.out.println("Duplicate detected! Book already in catalog.");
        } else {
            System.out.println("Book added.");
        }
        System.out.println("");
        
        // Accept donation - create donation library
        System.out.println("\nAccepting donation...");
        Library donation = new Library();
        donation.addBook(new Book("111", "Design Patterns", "Gamma"));
        donation.addBook(new Book("222", "Clean Code", "Martin"));
        donation.addBook(new Book("123", "Java Basics", "Smith"));  // Duplicate!
        
        int newBooksAdded = library1.acceptDonation(donation);
        System.out.println("Added " + newBooksAdded + " new books from donation");
        System.out.println("");
        
        System.out.println("\nLibrary 1 Catalog (after donation):");
        library1.printCatalog();
        System.out.println("Total books: " + library1.getBookCount());
        
        // Create second library
        System.out.println("\n" + "=".repeat(50));
        System.out.println("Creating Library 2...");
        Library library2 = new Library();
        library2.addBook(new Book("123", "Java Basics", "Smith"));      // Common
        library2.addBook(new Book("456", "Data Structures", "Jones"));  // Common
        library2.addBook(new Book("999", "Web Development", "Taylor")); // Unique to library2
        
        System.out.println("\nLibrary 2 Catalog:");
        library2.printCatalog();
        System.out.println("Total books: " + library2.getBookCount());
        
        // Find common books
        System.out.println("\n" + "=".repeat(50));
        System.out.println("Common books between Library 1 and Library 2:");
        Set<Book> commonBooks = library1.findCommonBooks(library2);
        if (commonBooks.isEmpty()) {
            System.out.println("No common books");
        } else {
            for (Book book : commonBooks) {
                System.out.println(book);
            }
        }
        System.out.println("Total common books: " + commonBooks.size());
        System.out.println("");
        
        // Find unique books (in library1 but not library2)
        System.out.println("\nBooks unique to Library 1 (not in Library 2):");
        Set<Book> uniqueBooks = library1.findUniqueBooks(library2);
        if (uniqueBooks.isEmpty()) {
            System.out.println("No unique books");
        } else {
            for (Book book : uniqueBooks) {
                System.out.println(book);
            }
        }
        System.out.println("Total unique books: " + uniqueBooks.size());
        System.out.println("");
        
        // Test hasBook and removeBook
        System.out.println("\n" + "=".repeat(50));
        System.out.println("Testing hasBook() and removeBook()...");
        System.out.println("Does Library 1 have ISBN 123? " + library1.hasBook("123"));
        System.out.println("Does Library 1 have ISBN 000? " + library1.hasBook("000"));
        System.out.println("");
        
        System.out.println("\nRemoving book with ISBN 789...");
        boolean removed = library1.removeBook("789");
        System.out.println("Removed: " + removed);
        System.out.println("");
        
        System.out.println("\nLibrary 1 Catalog (after removal):");
        library1.printCatalog();
        System.out.println("Total books: " + library1.getBookCount());
    }
}
