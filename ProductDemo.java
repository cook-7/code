class Product {
    private String productName;
    private int productId;
    private int quantity;
    private double price;

    // Default Constructor
    public Product() {
        this.productName = "Generic Product";
        this.productId = 0;
        this.quantity = 0;
        this.price = 0.0;
    }

    // Parameterized Constructor
    public Product(String productName, int productId, int quantity, double price) {
        this.productName = productName;
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
    }

    public void updateQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }

    public void displayDetails() {
        System.out.println("Product ID: " + this.productId + ", Name: " + this.productName +
                           ", Quantity: " + this.quantity + ", Price: ₹" + this.price);
    }
}

public class ProductDemo {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product("Mechanical Keyboard", 1002, 15, 3499.0);

        System.out.println("--- Initial Details ---");
        p1.displayDetails();
        p2.displayDetails();

        System.out.println("\n--- Updating p2 Quantity ---");
        p2.updateQuantity(28);
        p2.displayDetails();
    }
}
