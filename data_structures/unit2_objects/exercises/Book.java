package exercises;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return String.format("Book[title=%s, author=%s]", title, author);
    }

    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = book1;

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        System.out.println("book1 == book2: " + (book1 == book2) + " (different objects, same content)");
        System.out.println("book1 == book3: " + (book1 == book3) + " (same object)");
    }
}
