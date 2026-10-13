import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProductFileProcessor {
    public static void main(String[] args) {
        String fileName = "product_info.txt";
        double totalPrice = 0.0;
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue;

                String[] tokens = line.split("\\s+");
                if (tokens.length >= 2) {
                    String product = tokens[0];
                    double price = Double.parseDouble(tokens[1]);
                    System.out.println("Product: " + product + " | Price: ₹" + price);
                    totalPrice += price;
                    count++;
                }
            }

            if (count > 0) {
                double averagePrice = totalPrice / count;
                System.out.printf("\nTotal Products: %d\nAverage Price: ₹%.2f\n", count, averagePrice);
            } else {
                System.out.println("File is empty or contains no product entries.");
            }

        } catch (IOException e) {
            System.err.println("Error accessing file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Invalid price encountered in file: " + e.getMessage());
        }
    }
}
