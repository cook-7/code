import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class DrivingLicenseEligibilityDemo {
    public static void verifyEligibility(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("Age cannot be negative: " + age);
        }
        if (age >= 18) {
            System.out.println("Eligible for a driving license.");
        } else {
            System.out.println("Not eligible for a driving license (Must be 18 or older).");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter age: ");
            int age = Integer.parseInt(scanner.nextLine());

            verifyEligibility(age);

        } catch (NumberFormatException e) {
            System.out.println("Error [NumberFormatException]: Please supply a valid numerical age.");
        } catch (ArithmeticException e) {
            System.out.println("Error [ArithmeticException]: Division/calculation fault occurred.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error [ArrayIndexOutOfBoundsException]: Array boundary exceeded.");
        } catch (InvalidAgeException e) {
            System.out.println("Error [InvalidAgeException]: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error [Exception]: " + e.getMessage());
        } finally {
            System.out.println("Operation execution finished successfully.");
            scanner.close();
        }
    }
}
