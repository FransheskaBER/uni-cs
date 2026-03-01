package unit6_important_concepts;

public class Account {
    private static int counter = 0;
    private static double interestRate = 1.5;
    private String firstName;
    private String lastName;
    private double balance;
    private String accountNumber;
    private static final double MIN_BALANCE = 100.0;

    // constructor that increments the total account counter
    public Account(String firstName, String lastName) {
        counter++;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void applyInterest() {
        this.balance += this.balance * interestRate / 100; 
    }

    public static boolean isValidAccountNumber(String number) {
        if (number != null && number.length() == 10) {
            
            return true;
        }
        return false;
    }   
    
    public static int getTotalAccount() {
        return counter;
    }

    public String getAccountInfo() {
        return "Account Owner: " + this.firstName + " " + this.lastName + "- Account Number: " + this.accountNumber;
    }

    public void setAccountNumber(String number) {
        if (Account.isValidAccountNumber(number)) {
            this.accountNumber = number;
        } else {
            System.out.println("Invalid account number: " + number);
        }
    }

    public void setBalance(double balance) {
        if (balance >= MIN_BALANCE) {
            this.balance = balance;
        } else {
            System.out.println("Balance below minimum: " + balance);
        }
    }
    
    public double getBalance() {
        return this.balance;
    }

    public static void main(String[] args) {
        Account a1 = new Account("Fransheska", "Echevarria");
        Account a2 = new Account("Yotam", "Cohen");
        Account a3 = new Account("Mari", "Mithma");

        a1.setBalance(100);
        a2.setBalance(200);
        a3.setBalance(500);

        System.out.println("Total number of accounts created are: " + Account.getTotalAccount());
        System.out.println();
        System.out.println("Applying interest rate 1.5: ");
        a1.applyInterest();
        a2.applyInterest();
        a3.applyInterest();
        System.out.println(a1.getBalance());
        System.out.println(a2.getBalance());
        System.out.println(a3.getBalance());
        Account.interestRate = 5;
        a1.applyInterest();
        a2.applyInterest();
        a3.applyInterest();
        System.out.println();
        System.out.println("After changing interest rate to 5: ");
        System.out.println(a1.getBalance());
        System.out.println(a2.getBalance());
        System.out.println(a3.getBalance());

        System.out.println(Account.isValidAccountNumber("12345678910"));
        System.out.println(Account.isValidAccountNumber("123"));
    }

}
