package exercises;

import java.util.HashSet;
import java.util.Set;;

public class Library {
    private Set<Book> books = new HashSet<>();

    public boolean addBook(Book newBook) {
        return books.add(newBook);
    }

    public boolean removeBook(String isbn) {
        return books.remove(new Book(isbn, null, null));
    }

    public boolean hasBook(String isbn) {
        return books.contains(new Book(isbn, null, null));
    }

    public int acceptDonation(Library donatedBooks) {
        int beforeAddedBooks = books.size();
        books.addAll(donatedBooks.books);
        int afterAddedBooks = books.size();
        return afterAddedBooks - beforeAddedBooks;
    }

    public Set<Book> findCommonBooks(Library otherLibrary) {
        Set<Book> booksCopy = new HashSet<>(books);
        booksCopy.retainAll(otherLibrary.books);
        return booksCopy;
    }

    public Set<Book> findUniqueBooks(Library otherLibrary) {
        Set<Book> booksCopy = new HashSet<Book>(books);
        booksCopy.removeAll(otherLibrary.books);
        return booksCopy;
    }

    public void printCatalog() {
        if (books.isEmpty()) {
            System.out.println("No books in catalog");
        } else {
            for (Book b : books) {
                System.out.println(b.toString());
            }
        }
    }

    public int getBookCount() {
        return books.size();
    }    
}
