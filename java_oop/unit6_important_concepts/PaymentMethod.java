package unit6_important_concepts;

public abstract class PaymentMethod {
    // abstract methods:
    public abstract void processPayment(double amount); 
    public abstract double getTransactionFee(double amount);

    // concrete methods:
    public double getTotalCost(double amount) {
        return amount + getTransactionFee(amount);
    }
}
