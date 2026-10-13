abstract class Payment {
    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public abstract void makePayment();
}

class UPIPayment extends Payment {
    private String upiId;

    public UPIPayment(double amount, String upiId) {
        super(amount);
        this.upiId = upiId;
    }

    @Override
    public void makePayment() {
        System.out.println("Paid ₹" + amount + " instantly via UPI ID: " + upiId);
    }
}

class CardPayment extends Payment {
    private String maskedCardNumber;

    public CardPayment(double amount, String maskedCardNumber) {
        super(amount);
        this.maskedCardNumber = maskedCardNumber;
    }

    @Override
    public void makePayment() {
        System.out.println("Paid ₹" + amount + " using Card ending with: " + maskedCardNumber);
    }
}

public class PaymentPolymorphismDemo {
    public static void main(String[] args) {
        Payment[] paymentQueue = new Payment[] {
            new UPIPayment(1500.0, "user@okaxis"),
            new CardPayment(4590.0, "XXXX-XXXX-XXXX-4321"),
            new UPIPayment(250.0, "merchant@upi")
        };

        for (Payment payment : paymentQueue) {
            payment.makePayment();
        }
    }
}
