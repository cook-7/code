import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StudentFileProcessor {
    public static void main(String[] args) {
        String fileName = "student_info.txt";
        double totalMarks = 0.0;
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue;

                String[] tokens = line.split("\\s+");
                if (tokens.length >= 2) {
                    String name = tokens[0];
                    double marks = Double.parseDouble(tokens[1]);
                    System.out.println("Read -> Name: " + name + ", Marks: " + marks);
                    totalMarks += marks;
                    count++;
                }
            }

            if (count > 0) {
                double average = totalMarks / count;
                System.out.printf("\nTotal Students: %d\nAverage Marks: %.2f\n", count, average);
            } else {
                System.out.println("No records found in " + fileName);
            }

        } catch (IOException e) {
            System.err.println("File I/O Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error parsing marks from file: " + e.getMessage());
        }
    }
}
