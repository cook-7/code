class Book {
    private String title;
    private static int bookCount = 0;

    public Book(String title) {
        this.title = title;
        bookCount++;
    }

    // Static Method
    public static int getBookCount() {
        return bookCount;
    }

    // Instance Method
    public void displayBookStatus() {
        System.out.println("Book '" + this.title + "' added. Current pool count: " + bookCount);
    }
}

public class LibraryBookDemo {
    public static void main(String[] args) {
        Book b1 = new Book("Clean Code");
        Book b2 = new Book("Design Patterns");
        Book b3 = new Book("Refactoring");

        // Calling instance method
        b2.displayBookStatus();

        // Calling static method
        System.out.println("Total Books in Library (via Static Method): " + Book.getBookCount());
    }
}
