import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class ArithmeticAndAgeExceptionDemo {
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("Age cannot be negative: " + age);
        }
        System.out.println("Age verified successfully: " + age);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter first integer: ");
            int a = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter second integer: ");
            int b = Integer.parseInt(scanner.nextLine());

            System.out.println("Addition: " + (a + b));
            System.out.println("Subtraction: " + (a - b));
            System.out.println("Multiplication: " + (a * b));
            System.out.println("Division: " + (a / b));

            int[] testArr = new int[2];
            testArr[0] = a;
            testArr[1] = b;

            System.out.print("Enter age: ");
            int age = Integer.parseInt(scanner.nextLine());
            checkAge(age);

        } catch (NumberFormatException e) {
            System.out.println("Error [NumberFormatException]: Input must be a valid integer.");
        } catch (ArithmeticException e) {
            System.out.println("Error [ArithmeticException]: Cannot divide by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error [ArrayIndexOutOfBoundsException]: Array index is out of bounds.");
        } catch (InvalidAgeException e) {
            System.out.println("Error [InvalidAgeException]: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error [General Exception]: Unexpected failure occurred - " + e.getMessage());
        } finally {
            System.out.println("End of operation.");
            scanner.close();
        }
    }
}
