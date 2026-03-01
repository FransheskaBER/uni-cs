package unit7_constructors;

public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;
    private boolean isActive;

    public BankAccount() {
        accountNumber = "PENDING";
        ownerName = "";
        balance = 0.0;
        isActive = true;
    }

    public BankAccount(String accountNumber, String ownerName) {
        this();
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
    }

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this(accountNumber, ownerName);
        this.balance = balance;
    }

    public BankAccount(BankAccount original) {
        this(original.accountNumber, original.ownerName, original.balance);
        this.isActive = original.isActive;
    }

    public void printInfo() {
        System.out.println("ID: " + accountNumber + " Name: " + ownerName + " Balance: " + balance);
    }

    public void setBalance(double newBalance) {
        balance = newBalance;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("12345", "Fransheska", 500);
        BankAccount copyAccount = new BankAccount(account1);
        account1.setBalance(1000);
        account1.printInfo();
        copyAccount.printInfo();
    }
}
