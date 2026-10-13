class Book {
    private String title;
    private String author;
    private double price;
    private int bookId;

    // Default Constructor
    public Book() {
        this.title = "Untitled";
        this.author = "Unknown";
        this.price = 0.0;
        this.bookId = 0;
    }

    // Parameterized Constructor
    public Book(String title, String author, double price, int bookId) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.bookId = bookId;
    }

    public void updatePrice(double newPrice) {
        this.price = newPrice;
    }

    public void displayDetails() {
        System.out.println("Book ID: " + this.bookId + ", Title: " + this.title +
                           ", Author: " + this.author + ", Price: ₹" + this.price);
    }
}

public class BookDemo {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Effective Java", "Joshua Bloch", 650.0, 501);

        System.out.println("--- Initial Details ---");
        b1.displayDetails();
        b2.displayDetails();

        System.out.println("\n--- Updating b2 Price ---");
        b2.updatePrice(720.0);
        b2.displayDetails();
    }
}
