class BankAccount {
    private String accountNumber;
    private static int accountCount = 0;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        accountCount++;
    }

    // Static Method
    public static int getAccountCount() {
        return accountCount;
    }

    // Instance Method
    public void displayAccountInfo() {
        System.out.println("Account [" + this.accountNumber + "] reads total accounts: " + accountCount);
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("SB-1001");
        BankAccount a2 = new BankAccount("SB-1002");

        // Display count using instance method
        a1.displayAccountInfo();

        // Display count using static method
        System.out.println("Total Bank Accounts (via Static Method): " + BankAccount.getAccountCount());
    }
}
