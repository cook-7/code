import java.util.Scanner;

class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}

public class MarksExceptionDemo {
    public static void validateMarks(double marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks must be between 0 and 100. Entered: " + marks);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter number of subjects: ");
            int count = Integer.parseInt(scanner.nextLine());

            double[] marksArr = new double[count];
            double total = 0.0;

            for (int i = 0; i < count; i++) {
                System.out.print("Enter marks for subject " + (i + 1) + ": ");
                double mark = Double.parseDouble(scanner.nextLine());
                validateMarks(mark);
                marksArr[i] = mark;
                total += mark;
            }

            if (count == 0) {
                int err = 10 / 0;
            }
            double percentage = total / count;
            System.out.println("Calculated Percentage: " + percentage + "%");

        } catch (NumberFormatException e) {
            System.out.println("Error [NumberFormatException]: Invalid number entered.");
        } catch (ArithmeticException e) {
            System.out.println("Error [ArithmeticException]: Arithmetic calculation error.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error [ArrayIndexOutOfBoundsException]: Exceeded array boundaries.");
        } catch (InvalidMarksException e) {
            System.out.println("Error [InvalidMarksException]: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error [Exception]: An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("Result processing completed");
            scanner.close();
        }
    }
}
