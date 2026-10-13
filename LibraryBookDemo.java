class Book {
    private String title;
    private static int bookCount = 0;

    public Book(String title) {
        this.title = title;
        bookCount++;
    }

    public static int getBookCount() {
        return bookCount;
    }

    public void displayBookStatus() {
        System.out.println("Book '" + title +
                "' added. Current pool count: " + bookCount);
    }
}

class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Clean Code");
        Book b2 = new Book("Design Patterns");
        Book b3 = new Book("Refactoring");

        b2.displayBookStatus();

        System.out.println("Total Books in Library (via Static Method): "
                + Book.getBookCount());
    }
}
