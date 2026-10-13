import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EmployeeFileProcessor {
    public static void main(String[] args) {
        String fileName = "employee_info.txt";
        double totalSalary = 0.0;
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue;

                String[] tokens = line.split("\\s+");
                if (tokens.length >= 2) {
                    String name = tokens[0];
                    double salary = Double.parseDouble(tokens[1]);
                    System.out.println("Employee: " + name + " | Salary: ₹" + salary);
                    totalSalary += salary;
                    count++;
                }
            }

            if (count > 0) {
                double averageSalary = totalSalary / count;
                System.out.printf("\nTotal Employees: %d\nAverage Salary: ₹%.2f\n", count, averageSalary);
            } else {
                System.out.println("File is empty or contains no records.");
            }

        } catch (IOException e) {
            System.err.println("File reading failed: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Data format error in salaries: " + e.getMessage());
        }
    }
}
